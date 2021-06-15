listacc' a xs
    | a <= length xs = sum (take a xs):listacc' (a+1) xs
    | otherwise = []

listacc [] = []
listacc xs = listacc' 1 xs

main = do
    a <- readLn :: IO [Int]
    print $ listacc a