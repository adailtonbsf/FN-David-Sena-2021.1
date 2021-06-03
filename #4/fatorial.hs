fatorial a = product [1..a]

main = do
    a <- readLn :: IO Int
    print $ fatorial a