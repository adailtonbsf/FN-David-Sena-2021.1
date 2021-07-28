import qualified Data.Map as Map
import Data.Maybe
import Data.Either
data Estado = Alugado | Livre deriving (Show, Eq)
type Codigo = String
type Armario = (Estado, Codigo)
type Armarios = Map.Map Int (Estado, Codigo)

-- consulta : dado o número de um armário, retorna se ele está alugado ou não
-- retorna Nothing se o armário não existir
consulta :: Int -> Armarios -> Maybe Estado
consulta indice armarios = if null armario then Nothing else Just (head armario)
    where armario = [estado | (int, (estado, codigo)) <- Map.toList armarios, int == indice]

-- dado o número do armário, retorna Right armário ou Left "Armario nao existe"
pegarArmario :: Int -> Armarios -> Either String Armario
pegarArmario indice armarios = if not (null armario) then Right (head armario)
                                    else Left "Armario nao existe"
    where armario = [(estado, codigo) | (int, (estado, codigo)) <- Map.toList armarios, int == indice]

-- consultar: dado o número de um armário retorna "Right código"
-- Se não existir, retorna "Left Armario não existe", se já estiver alugado retorna "Left ja esta ocupado"
-- Utilize a função pegarArmario para obter o armário e verificar se ele existe
-- Não reescreva a mesma mensagem de erro, utilize a invocação do pegarArmário
pegarCodigo :: Int -> Armarios -> Either String Codigo
pegarCodigo indice armarios = if isRight pegaArmario
                                then
                                    if null armario then Left "ja esta ocupado"
                                    else Right (head armario)
                                else Left (head (lefts [pegaArmario]))
    where
        pegaArmario = pegarArmario indice armarios
        armario = [codigo | (int, (estado, codigo)) <- Map.toList armarios, int == indice && estado == Livre]


-- aluguel - se o armário existir e estiver desocupado, o estado do armário no mapa é alterado para alugado
-- reaproveite a função pegarCodigo para obter a chave atual e os erros de "não existe" e "está ocupado"
aluguel :: Int -> Armarios -> Either String Armarios
aluguel indice armarios = if isRight pegaCodigo then Right lista
                          else Left (head (lefts [pegaCodigo]))
    where
        lista = Map.insert indice (Alugado, cod) $ Map.fromList [(int, (estado, codigo)) | (int, (estado, codigo)) <- Map.toList armarios, int /= indice]
        (est, cod) = head $ rights [pegarArmario indice armarios]
        pegaCodigo = pegarCodigo indice armarios
        consultar = consulta indice armarios

-- para devolver um armário é necessário que ele exista, que esteja alugado e que o código esteja correto
-- utilize a função pegar armário para verificar a existência.
-- Se o armário não estiver alugado ou se o código estiver incorreto avise utilizando o Left.
devolucao :: Int -> Codigo -> Armarios -> Either String Armarios
devolucao indice codigo armarios =  if isRight pegaArmario then
                                                            if consultar == Just Alugado then 
                                                                                            if codigo == cod then Right lista
                                                                                            else Left "Codigo incorreto"
                                                            else Left "Armario nao esta alugado"
                                    else Left (head (lefts [pegaArmario]))
    where
        lista = Map.insert indice (Livre, cod) $ Map.fromList [(int, (estado, codigo)) | (int, (estado, codigo)) <- Map.toList armarios, int /= indice]
        (est, cod) = head $ rights [pegarArmario indice armarios]
        pegaArmario = pegarArmario indice armarios
        pegaCodigo = pegarCodigo indice armarios
        consultar = consulta indice armarios

lockers :: Armarios
lockers = Map.fromList
    [(100,(Alugado,"ZD39I"))
    ,(101,(Livre,"JAH3I"))
    ,(109,(Alugado,"893JJ"))
    ,(110,(Alugado,"99292"))
    ]

main :: IO ()
main = do
    let armarios0 = lockers
    print $ "01 " ++ show armarios0
    print $ "02 " ++ show (consulta 100 armarios0)
    print $ "03 " ++ show (consulta 101 armarios0)
    print $ "04 " ++ show (consulta 200 armarios0)
    print $ "05 " ++ show (pegarCodigo 100 armarios0)
    print $ "06 " ++ show (pegarCodigo 101 armarios0)
    print $ "07 " ++ show (pegarCodigo 200 armarios0)
    print $ "08 " ++ show (aluguel 100 armarios0)
    print $ "09 " ++ show (consulta 101 armarios0)
    let armarios1 = fromRight armarios0 $ aluguel 101 armarios0
    print $ "10 " ++ show (consulta 101 armarios1)
    print $ "11 " ++ show (fromLeft "" $ devolucao 103 "IQSA9" armarios1)
    print $ "12 " ++ show (fromLeft "" $ devolucao 101 "ZD39I" armarios1)
    let armarios2 = fromRight armarios1 $ devolucao 110 "99292" armarios1
    print $ "13 " ++ show (consulta 110 armarios2)
    print $ "14 " ++ show armarios2

{--
"01 fromList [(100,(Alugado,\"ZD39I\")),(101,(Livre,\"JAH3I\")),(109,(Alugado,\"893JJ\")),(110,(Alugado,\"99292\"))]"
"02 Just Alugado"
"03 Just Livre"
"04 Nothing"
"05 Left \"Armario 100 ja esta ocupado\""
"06 Right \"JAH3I\""
"07 Left \"Armario 200 nao existe\""
"08 Left \"Armario 100 ja esta ocupado\""
"09 Just Livre"
"10 Just Alugado"
"11 \"Armario 103 nao existe\""
"12 \"Codigo incorreto\""
"13 Just Livre"
"14 fromList [(100,(Alugado,\"ZD39I\")),(101,(Alugado,\"JAH3I\")),(109,(Alugado,\"893JJ\")),(110,(Livre,\"99292\"))]"
--}