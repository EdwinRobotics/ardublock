package com.ardublock.translator.block;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.exception.SocketNullException;

public class UltrasonicBlock extends TranslatorBlock
{
	protected UltrasonicBlock(Long blockId, Translator translator)
	{
		super(blockId, translator);
	}

	private final static String ultraSonicFunction = "int ardublockUltrasonicSensorCodeAutoGeneratedReturnCM(int trigPin, int echoPin)\n{\n  int duration;\n  digitalWrite(trigPin, LOW);\n  delayMicroseconds(2);\n  digitalWrite(trigPin, HIGH);\n  delayMicroseconds(5);\n  digitalWrite(trigPin, LOW);\n  duration = pulseIn(echoPin, HIGH);\n  duration = duration / 59;\n  return duration;\n}\n";
	
	public String toCode()
	{
		String trigPin;
		String echoPin;
		TranslatorBlock translatorBlock = getTranslatorBlockAtSocket(0);
		if (translatorBlock == null)
		{
			throw new SocketNullException();
		}
		trigPin = translatorBlock.toCode();
		translatorBlock = getTranslatorBlockAtSocket(1);
		if (translatorBlock == null)
		{
			throw new SocketNullException();
		}
		echoPin = translatorBlock.toCode();
		
		translator.addSetupCommand("digitalWrite( " + trigPin + " , LOW );\n");
		
		translator.addDefinitionCommand(ultraSonicFunction);
		
		String ret = "ardublockUltrasonicSensorCodeAutoGeneratedReturnCM( " + trigPin + " , " + echoPin + " )";
		

		return ret;
	}
	
}
