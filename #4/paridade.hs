paridade' [x] = if x then 1 else 0
paridade' (x:xs) = if x then 1 + paridade' xs
                    else 0 + paridade' xs

paridade a = if length a > 0 then odd $ paridade' a else False 

main = do
    a <- readLn :: IO [Bool]
    print $ paridade a