line a = [soma (a - 1) + 1.. soma a]
    where soma b = sum [1..b]
triangle a = [line b | b <- [1..a]]

main = do
    a <- readLn :: IO Int
    print $ triangle a