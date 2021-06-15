line a = [soma (a - 1) + 1.. soma a]
    where soma b = sum [1..b]

main = do
    a <- readLn :: IO Int
    print $ line a