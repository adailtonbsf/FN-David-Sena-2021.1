max3 a b c 
    | a >= b && a >= c = a
    | b >= a && b >= c = b
    | c >= a && c >= a = c

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    c <- readLn :: IO Int
    print $ max3 a b c