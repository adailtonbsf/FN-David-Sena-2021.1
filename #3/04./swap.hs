swap a b c = 
    if b < 0 || c > length a then a 
                else esquerda ++ [elemento_j] ++ meio ++ [elemento_i] ++ direita
                where 
                    esquerda = take b a
                    elemento_i = a !! b
                    meio = take (c - (b + 1)) $ drop (b + 1) a
                    elemento_j = a !! c
                    direita = drop (c + 1) a

main = do
    a <- readLn :: IO [Int]
    b <- readLn :: IO Int
    c <- readLn :: IO Int
    print $ swap a b c