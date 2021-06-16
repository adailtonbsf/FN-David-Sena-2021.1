remove a [] = []
remove a (x:xs)
    | a == x = xs
    | otherwise = x:remove a xs

menores' a xs
    | a == 0 = []
    | a > length xs = xs
    | otherwise = menor:menores' (a-1) ys
    where 
        menor = minimum xs
        ys = remove menor xs

menores a xs = [x | x <- xs, x `elem` menores' a xs]


main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ menores a b