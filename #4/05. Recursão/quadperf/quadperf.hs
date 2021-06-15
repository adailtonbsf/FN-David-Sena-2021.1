quadperf' a b
    | b == a = False
    | b * b == a = True
    | otherwise = quadperf' a (b+1)

quadperf a = quadperf' a 1

main = do
    a <- readLn :: IO Int
    print $ quadperf a