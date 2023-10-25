def preorder(self, n):
	if n!= None:
    	print(n.item, '', end='') # 노드 방문
        if n.left:
        	self.preodrer(n.left) # 왼쪽 서브 트리 순회
        if n.right:
        	self.preodrer(n.right) # 오른쪽 서브 트리 순회