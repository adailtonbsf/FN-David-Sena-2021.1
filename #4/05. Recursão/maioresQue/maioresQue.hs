maioresQue a [] = []
maioresQue a (x:xs)
    | x > a = x:maioresQue a xs
    | otherwise = maioresQue a xs

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ maioresQue a b