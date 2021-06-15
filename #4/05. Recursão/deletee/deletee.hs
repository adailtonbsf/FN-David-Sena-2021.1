deletee a [] = []
deletee a (x:xs) = if x == a then xs else x:deletee a xs

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ deletee a b