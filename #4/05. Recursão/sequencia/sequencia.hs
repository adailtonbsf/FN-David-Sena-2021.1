sequencia a b
    | a <= 0 = []
    | otherwise = b:sequencia (a-1) (b+1)

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    print $ sequencia a b