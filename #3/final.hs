final x xs = reverse $ take x (reverse xs)

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ final a b