fib a 
    | a == 0 = 0
    | a == 1 = 1
    | otherwise = fib (a-1) + fib (a-2)

main = do
    a <- readLn :: IO Int
    print $ fib a