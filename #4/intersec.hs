intersec a b = [x | x <- a, x `elem` b]

main = do
    a <- readLn :: IO [Int]
    b <- readLn :: IO [Int]
    print $ intersec a b