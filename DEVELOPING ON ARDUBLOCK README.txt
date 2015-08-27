When working on ardublock there are 3 major files to be concerned about:

	1. ardublock.xml (/src/main/resources/com/ardublock/block)
	2. ardublock.properties (/src/main/resources/com/ardublock/block)
	3. block-mapping.properties (/src/main/resources/com/ardublock/block)
	4. TranslatorBlockFactory.java (/src/main/java/com/ardublock/translator/block)

1. ardublock.xml
	* Block definition
	* Drawer layout
	* Block families (for drop down menu)
2. ardublock.properties
	* Labelling of blocks (assign block info to a variable that can be used later on for describing the block etc, helps in multi lingual situations)
3. block-mapping.properties
	* Assigns java files to each block
4. TranslatorBlockfactory
	* Assign short names to functions