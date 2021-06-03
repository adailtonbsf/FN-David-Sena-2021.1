splitints a = (impares, pares)
    where
        impares = [x | x <- a, odd x]
        pares = [x | x <- a, even x]

main = do
    a <- readLn :: IO [Int]
    print $ splitints a