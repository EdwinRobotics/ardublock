package com.ardublock.translator.block.tinker;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.PinReadAnalogBlock;

public class TinkerAccmeterBlock extends PinReadAnalogBlock
{
	public TinkerAccmeterBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}
}
