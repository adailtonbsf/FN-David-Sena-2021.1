indices v xs = [y | (x,y) <- zip xs [0..], x == v]

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ indices a b