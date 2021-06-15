line' a b
    | a > 0 = (b+1):line' (a-1) (b+1)
    | otherwise = []

line a = soma:line' (a-1) soma
    where
        b = a - 1
        soma = sum [1..b] + 1

triangle' a b
    | b <= a = line b:triangle' a (b+1)
    | otherwise = []

triangle a = triangle' a 1

main = do
    a <- readLn :: IO Int
    print $ triangle a