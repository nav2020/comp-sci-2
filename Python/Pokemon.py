class Pokemon(object):
	#constructor
	def _init_(self,initName,initHP,initType, initLevel):
		self.name = initName
		self.HP = initHP
		self.type = initType
		self.level = initLevel
		self.moves = self.genMoves()
		# self.asciiArt = self.genASCII()
	# getters
	def getName(n):
		return self.name
	def getHP(hp):
		return self.HP
	def getType(t):
		return self.type
	def getLevel(l):
		return self.type
	# setters
	def setName(n):
		self.name = n
	def setHP(hp):
		self.HP = hp
	def setType(t):
		self.type = t
	def setLevel(l):
		self.type = l
	# gets a moveset for each pokemon
	def genMoves(s):
		# move lists for each pokemon
		bulbasaurMoveset = []
	def genASCII(p):
		pass

class Player(object):
	#constructor
	def _init_(self,initName,initPokemon,initCatchphrase):
		self.name = initName
		self.pokemon = initPokemon
		self.catchphrase = initCatchphrase
	def getName():
		return self.name
	def sayCatchphrase():
		print self.catchphrase