selec xs [] = []
selec xs (y:ys) = xs !! y : selec xs ys

main = do
    a <- getLine
    b <- readLn :: IO [Int]
    print $ selec a b