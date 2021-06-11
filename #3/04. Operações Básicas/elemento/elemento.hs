{-  Usando recursividade

elemento a b = 
    if a < 0 then elemento' index b else elemento' a b
        where index = a + length b

elemento' a b = 
    if a == 0 then head b 
        else elemento' (a-1) $ tail b   -}

elemento a b
    | a < 0 = b !! (a + length b)
    | otherwise  = b !! a

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO [Int]
    print $ elemento a b