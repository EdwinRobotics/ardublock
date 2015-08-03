package com.ardublock.translator.block.er;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.NumberBlock;
import com.ardublock.translator.block.TranslatorBlock;
import com.ardublock.translator.block.exception.BlockException;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class ERJoyStickButtonBlock extends TranslatorBlock
{
	public ERJoyStickButtonBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	@Override
	public String toCode() throws SocketNullException, SubroutineNotDeclaredException
	{
		String ret = "analogRead(A";
		TranslatorBlock translatorBlock = this.getRequiredTranslatorBlockAtSocket(0);
		if (translatorBlock instanceof NumberBlock)
		{
			ret = ret + translatorBlock.toCode();
			ret = ret + ") > 1000";
			return codePrefix + ret + codeSuffix;
		}
		else
		{
			throw new BlockException(blockId, "analog pin# must be a number");
		}
	}
}
