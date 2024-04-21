class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        graph = [[] for _ in range(n)]
        
        for e in edges:
            graph[e[0]].append(e[1])
            graph[e[1]].append(e[0])
        
        visited = [False] * n
        visited[source] = True
        queue = deque([source])
        
        while queue:
            temp = queue.popleft()
            
            if temp == destination:
                return True
            
            for connect in graph[temp]:
                if not visited[connect]:
                    visited[connect] = True
                    queue.append(connect)
        
        return False