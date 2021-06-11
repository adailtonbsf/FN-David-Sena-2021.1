uniao a [] = a
uniao a (x:xs) = if x `elem` a then uniao a xs
                    else uniao (a ++ [x]) xs


main = do
    a <- readLn :: IO [Int]
    b <- readLn :: IO [Int]
    print $ uniao a b