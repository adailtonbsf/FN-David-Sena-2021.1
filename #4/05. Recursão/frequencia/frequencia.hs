frequencia a [] = 0
frequencia a (x:xs)
    | a == x = 1 + frequencia a xs
    | otherwise = frequencia a xs

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ frequencia a b

teste = do
    print $ frequencia 1 [] == 0
    print $ frequencia 4 [4] == 1
    print $ frequencia 4 [5] == 0
    print $ frequencia 4 [4,4] == 2
    print $ frequencia 2 [4,4] == 0
    print $ frequencia 5 [4,5,2,1,5,5,9] == 3