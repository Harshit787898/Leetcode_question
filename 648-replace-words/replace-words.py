class Solution:
    def findRoot(self, word, dictSet):
        for i in range(1, len(word) + 1):
            if word[:i] in dictSet:
                return word[:i]
        return word
    
    def replaceWords(self, dictionary, sentence):
        dictSet = set(dictionary)
        words = sentence.split()
        ans = []
        
        for word in words:
            root = self.findRoot(word, dictSet)
            ans.append(root)
        
        return ' '.join(ans)

        