unique [] = []
unique (x:xs) = x : unique [y | y <- xs, y /= x]

main = do
    a <- readLn :: IO [Int]
    print $ unique a