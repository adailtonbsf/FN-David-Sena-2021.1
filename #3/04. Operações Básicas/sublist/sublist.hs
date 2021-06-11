sublist a b c = drop begin $ take end c
    where 
        begin = if a < 0 then a + length c else a
        end = if b < 0 then b + length c else b

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    c <- readLn :: IO [Int]
    print $ sublist a b c