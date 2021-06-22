isPalind xs = xs == reverse xs

main = do
    a <- getLine
    print $ isPalind a