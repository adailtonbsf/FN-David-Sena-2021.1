min2 a b = if a < b then a else b

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    print $ min2 a b