maior [x] = x
maior (x:xs) = if x > resto then x else resto
    where resto = maior xs

main = do
    a <- readLn :: IO [Int]
    print $ maior a