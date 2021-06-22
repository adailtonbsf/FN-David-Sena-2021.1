toLower x
    | x `elem` ['A'..'Z'] = head [y | (y,z) <- zip ['a'..'z'] ['A'..'Z'], z == x]
    | otherwise = x

toUpper x
    | x `elem` ['a'..'z'] = head [z | (y,z) <- zip ['a' .. 'z'] ['A' .. 'Z'], y == x]
    | otherwise = x

titulo' fn [] = []
titulo' fn (x:xs)
    | x == ' ' = x : titulo' toUpper xs
    | otherwise = fn x : titulo' toLower xs

titulo [] = []
titulo (x:xs) = toUpper x : titulo' toLower xs

main = do
    a <- getLine
    print $ titulo a