alter' a b = if a <= b then [a,-a] ++ alter' (a+1) b else []

alter a
    | a <= 0 = []
    | otherwise = alter' 1 a

main = do
    a <- readLn :: IO Int
    print $ alter a