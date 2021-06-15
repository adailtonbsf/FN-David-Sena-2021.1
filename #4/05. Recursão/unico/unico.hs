unico' a [] = []
unico' a (x:xs)
    | a == x = x:unico' a xs
    | otherwise = unico' a xs

unico a xs = length (unico' a xs) == 1

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ unico a b
