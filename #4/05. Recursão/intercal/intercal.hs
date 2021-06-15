intercal [] [] = []
intercal (x:xs) [] = x:intercal xs []
intercal [] (y:ys) = y:intercal ys []
intercal (x:xs) ys = x:intercal ys xs

main = do
    a <- readLn :: IO [Int]
    b <- readLn :: IO [Int]
    print $ intercal a b