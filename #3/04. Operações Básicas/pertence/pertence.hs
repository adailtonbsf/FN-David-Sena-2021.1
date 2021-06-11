pertence a [] = False
pertence a (x:xs) = (a == x) || pertence a xs

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ pertence a b