//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SD40T2
// Model Creator: Bida
// Created on: 04.10.2020 - 12:06:33
// Last changed on: 04.10.2020 - 12:06:33

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelFlexicoil_C2H;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.common.api.AbstractTrains;
import train.common.library.Info;

import java.util.ArrayList;

public class ModelSD40T2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSD40T2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[379];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 258, 102, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 254, 82, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 313, 116, textureX, textureY); // Box 36
		bodyModel[3] = new ModelRendererTurbo(this, 314, 29, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 243, 129, textureX, textureY); // Box 112
		bodyModel[5] = new ModelRendererTurbo(this, 53, 152, textureX, textureY); // Box 164
		bodyModel[6] = new ModelRendererTurbo(this, 12, 125, textureX, textureY); // Box 3
		bodyModel[7] = new ModelRendererTurbo(this, 1, 152, textureX, textureY); // Box 259
		bodyModel[8] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 262
		bodyModel[9] = new ModelRendererTurbo(this, 53, 160, textureX, textureY); // Box 264
		bodyModel[10] = new ModelRendererTurbo(this, 1, 160, textureX, textureY); // Box 265
		bodyModel[11] = new ModelRendererTurbo(this, 53, 145, textureX, textureY); // Box 261
		bodyModel[12] = new ModelRendererTurbo(this, 44, 135, textureX, textureY); // Box 143
		bodyModel[13] = new ModelRendererTurbo(this, 14, 135, textureX, textureY); // Box 62
		bodyModel[14] = new ModelRendererTurbo(this, 11, 136, textureX, textureY); // Box 61
		bodyModel[15] = new ModelRendererTurbo(this, 51, 136, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[17] = new ModelRendererTurbo(this, 24, 117, textureX, textureY); // Box 98
		bodyModel[18] = new ModelRendererTurbo(this, 38, 102, textureX, textureY); // Box 197
		bodyModel[19] = new ModelRendererTurbo(this, 37, 131, textureX, textureY); // Box 80
		bodyModel[20] = new ModelRendererTurbo(this, 41, 135, textureX, textureY); // Box 144
		bodyModel[21] = new ModelRendererTurbo(this, 24, 128, textureX, textureY); // Box 145
		bodyModel[22] = new ModelRendererTurbo(this, 21, 131, textureX, textureY); // Box 147
		bodyModel[23] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Box 148
		bodyModel[24] = new ModelRendererTurbo(this, 2, 170, textureX, textureY); // Box 4
		bodyModel[25] = new ModelRendererTurbo(this, 56, 162, textureX, textureY); // Box 4
		bodyModel[26] = new ModelRendererTurbo(this, 2, 182, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 36, 170, textureX, textureY); // Box 4
		bodyModel[28] = new ModelRendererTurbo(this, 71, 160, textureX, textureY); // Box 4
		bodyModel[29] = new ModelRendererTurbo(this, 36, 182, textureX, textureY); // Box 4
		bodyModel[30] = new ModelRendererTurbo(this, 16, 2, textureX, textureY); // Box 2
		bodyModel[31] = new ModelRendererTurbo(this, 266, 76, textureX, textureY); // Box 159
		bodyModel[32] = new ModelRendererTurbo(this, 370, 170, textureX, textureY); // Box 3
		bodyModel[33] = new ModelRendererTurbo(this, 407, 178, textureX, textureY); // Box 246
		bodyModel[34] = new ModelRendererTurbo(this, 462, 114, textureX, textureY); // Box 266
		bodyModel[35] = new ModelRendererTurbo(this, 449, 78, textureX, textureY); // Box 4
		bodyModel[36] = new ModelRendererTurbo(this, 1, 7, textureX, textureY); // Box 5
		bodyModel[37] = new ModelRendererTurbo(this, 366, 146, textureX, textureY); // Box 80
		bodyModel[38] = new ModelRendererTurbo(this, 406, 150, textureX, textureY); // Box 179
		bodyModel[39] = new ModelRendererTurbo(this, 422, 173, textureX, textureY); // Box 4
		bodyModel[40] = new ModelRendererTurbo(this, 467, 166, textureX, textureY); // Box 4
		bodyModel[41] = new ModelRendererTurbo(this, 422, 185, textureX, textureY); // Box 4
		bodyModel[42] = new ModelRendererTurbo(this, 439, 175, textureX, textureY); // Box 4
		bodyModel[43] = new ModelRendererTurbo(this, 482, 168, textureX, textureY); // Box 4
		bodyModel[44] = new ModelRendererTurbo(this, 439, 188, textureX, textureY); // Box 4
		bodyModel[45] = new ModelRendererTurbo(this, 16, 10, textureX, textureY); // Box 2
		bodyModel[46] = new ModelRendererTurbo(this, 245, 82, textureX, textureY); // Box 193
		bodyModel[47] = new ModelRendererTurbo(this, 51, 18, textureX, textureY); // Box 52 door swing right
		bodyModel[48] = new ModelRendererTurbo(this, 83, 4, textureX, textureY); // Box 70
		bodyModel[49] = new ModelRendererTurbo(this, 30, 6, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 78, 6, textureX, textureY); // Box 190
		bodyModel[51] = new ModelRendererTurbo(this, 9, 4, textureX, textureY); // Box 313
		bodyModel[52] = new ModelRendererTurbo(this, 69, 18, textureX, textureY); // Box 314 door swing right
		bodyModel[53] = new ModelRendererTurbo(this, 101, 23, textureX, textureY); // Box 316
		bodyModel[54] = new ModelRendererTurbo(this, 365, 178, textureX, textureY); // Box 201
		bodyModel[55] = new ModelRendererTurbo(this, 417, 140, textureX, textureY); // Box 202
		bodyModel[56] = new ModelRendererTurbo(this, 366, 174, textureX, textureY); // Box 207
		bodyModel[57] = new ModelRendererTurbo(this, 86, 41, textureX, textureY); // Box 11
		bodyModel[58] = new ModelRendererTurbo(this, 93, 37, textureX, textureY); // Box 210
		bodyModel[59] = new ModelRendererTurbo(this, 34, 23, textureX, textureY); // Box 211
		bodyModel[60] = new ModelRendererTurbo(this, 78, 47, textureX, textureY); // Box 48
		bodyModel[61] = new ModelRendererTurbo(this, 82, 49, textureX, textureY); // Box 43
		bodyModel[62] = new ModelRendererTurbo(this, 62, 44, textureX, textureY); // Box 44
		bodyModel[63] = new ModelRendererTurbo(this, 105, 37, textureX, textureY, "lamp"); // Box 117 liveryimg 2 glow
		bodyModel[64] = new ModelRendererTurbo(this, 105, 34, textureX, textureY, "lamp"); // Box 118 liveryimg 2 glow
		bodyModel[65] = new ModelRendererTurbo(this, 79, 42, textureX, textureY, "lamp"); // Box 186 headlight front
		bodyModel[66] = new ModelRendererTurbo(this, 72, 44, textureX, textureY, "lamp"); // Box 187 headlight front
		bodyModel[67] = new ModelRendererTurbo(this, 66, 23, textureX, textureY); // Box 219
		bodyModel[68] = new ModelRendererTurbo(this, 119, 6, textureX, textureY); // Box 220
		bodyModel[69] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Box 221
		bodyModel[70] = new ModelRendererTurbo(this, 104, 4, textureX, textureY); // Box 222
		bodyModel[71] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 223
		bodyModel[72] = new ModelRendererTurbo(this, 34, 41, textureX, textureY); // Box 224
		bodyModel[73] = new ModelRendererTurbo(this, 368, 178, textureX, textureY); // Box 225
		bodyModel[74] = new ModelRendererTurbo(this, 12, 135, textureX, textureY); // Box 226
		bodyModel[75] = new ModelRendererTurbo(this, 10, 131, textureX, textureY); // Box 227
		bodyModel[76] = new ModelRendererTurbo(this, 268, 108, textureX, textureY); // Box 229
		bodyModel[77] = new ModelRendererTurbo(this, 270, 70, textureX, textureY); // Box 230
		bodyModel[78] = new ModelRendererTurbo(this, 378, 70, textureX, textureY); // Box 231
		bodyModel[79] = new ModelRendererTurbo(this, 370, 108, textureX, textureY); // Box 232
		bodyModel[80] = new ModelRendererTurbo(this, 272, 121, textureX, textureY); // Box 86
		bodyModel[81] = new ModelRendererTurbo(this, 272, 125, textureX, textureY); // Box 87
		bodyModel[82] = new ModelRendererTurbo(this, 271, 156, textureX, textureY); // Box 255
		bodyModel[83] = new ModelRendererTurbo(this, 271, 152, textureX, textureY); // Box 256
		bodyModel[84] = new ModelRendererTurbo(this, 333, 110, textureX, textureY); // Box 241
		bodyModel[85] = new ModelRendererTurbo(this, 335, 68, textureX, textureY); // Box 242
		bodyModel[86] = new ModelRendererTurbo(this, 371, 68, textureX, textureY); // Box 243
		bodyModel[87] = new ModelRendererTurbo(this, 363, 110, textureX, textureY); // Box 244
		bodyModel[88] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 245
		bodyModel[89] = new ModelRendererTurbo(this, 89, 103, textureX, textureY); // Box 246
		bodyModel[90] = new ModelRendererTurbo(this, 54, 129, textureX, textureY); // Box 81
		bodyModel[91] = new ModelRendererTurbo(this, 51, 128, textureX, textureY); // Box 81
		bodyModel[92] = new ModelRendererTurbo(this, 11, 129, textureX, textureY); // Box 176
		bodyModel[93] = new ModelRendererTurbo(this, 6, 129, textureX, textureY); // Box 177
		bodyModel[94] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 271
		bodyModel[95] = new ModelRendererTurbo(this, 83, 136, textureX, textureY); // Box 274
		bodyModel[96] = new ModelRendererTurbo(this, 97, 136, textureX, textureY); // Box 258
		bodyModel[97] = new ModelRendererTurbo(this, 106, 136, textureX, textureY); // Box 260
		bodyModel[98] = new ModelRendererTurbo(this, 101, 134, textureX, textureY); // Box 261
		bodyModel[99] = new ModelRendererTurbo(this, 96, 125, textureX, textureY); // Box 265
		bodyModel[100] = new ModelRendererTurbo(this, 101, 123, textureX, textureY); // Box 266
		bodyModel[101] = new ModelRendererTurbo(this, 105, 125, textureX, textureY); // Box 267
		bodyModel[102] = new ModelRendererTurbo(this, 34, 120, textureX, textureY); // Box 268
		bodyModel[103] = new ModelRendererTurbo(this, 12, 120, textureX, textureY); // Box 269
		bodyModel[104] = new ModelRendererTurbo(this, 304, 38, textureX, textureY); // Box 270
		bodyModel[105] = new ModelRendererTurbo(this, 292, 55, textureX, textureY); // Box 271
		bodyModel[106] = new ModelRendererTurbo(this, 292, 50, textureX, textureY); // Box 272
		bodyModel[107] = new ModelRendererTurbo(this, 306, 1, textureX, textureY); // Box 273
		bodyModel[108] = new ModelRendererTurbo(this, 333, 4, textureX, textureY); // Box 274
		bodyModel[109] = new ModelRendererTurbo(this, 340, 3, textureX, textureY); // Box 275
		bodyModel[110] = new ModelRendererTurbo(this, 357, 3, textureX, textureY); // Box 278
		bodyModel[111] = new ModelRendererTurbo(this, 376, 5, textureX, textureY); // Box 280
		bodyModel[112] = new ModelRendererTurbo(this, 86, 117, textureX, textureY); // Box 281
		bodyModel[113] = new ModelRendererTurbo(this, 83, 117, textureX, textureY); // Box 282
		bodyModel[114] = new ModelRendererTurbo(this, 83, 107, textureX, textureY); // Box 283
		bodyModel[115] = new ModelRendererTurbo(this, 86, 107, textureX, textureY); // Box 284
		bodyModel[116] = new ModelRendererTurbo(this, 335, 22, textureX, textureY); // Box 285
		bodyModel[117] = new ModelRendererTurbo(this, 335, 15, textureX, textureY); // Box 286
		bodyModel[118] = new ModelRendererTurbo(this, 415, 169, textureX, textureY); // Box 288
		bodyModel[119] = new ModelRendererTurbo(this, 118, 125, textureX, textureY); // Box 291
		bodyModel[120] = new ModelRendererTurbo(this, 112, 103, textureX, textureY); // Box 292
		bodyModel[121] = new ModelRendererTurbo(this, 125, 107, textureX, textureY); // Box 293
		bodyModel[122] = new ModelRendererTurbo(this, 128, 107, textureX, textureY); // Box 294
		bodyModel[123] = new ModelRendererTurbo(this, 115, 123, textureX, textureY); // Box 295
		bodyModel[124] = new ModelRendererTurbo(this, 118, 123, textureX, textureY); // Box 296
		bodyModel[125] = new ModelRendererTurbo(this, 26, 129, textureX, textureY); // Box 302
		bodyModel[126] = new ModelRendererTurbo(this, 21, 122, textureX, textureY); // Box 303
		bodyModel[127] = new ModelRendererTurbo(this, 34, 129, textureX, textureY); // Box 304
		bodyModel[128] = new ModelRendererTurbo(this, 299, 25, textureX, textureY); // Box 308
		bodyModel[129] = new ModelRendererTurbo(this, 288, 25, textureX, textureY); // Box 309
		bodyModel[130] = new ModelRendererTurbo(this, 306, 15, textureX, textureY); // Box 310
		bodyModel[131] = new ModelRendererTurbo(this, 295, 15, textureX, textureY); // Box 311
		bodyModel[132] = new ModelRendererTurbo(this, 119, 136, textureX, textureY); // Box 312
		bodyModel[133] = new ModelRendererTurbo(this, 119, 134, textureX, textureY); // Box 313
		bodyModel[134] = new ModelRendererTurbo(this, 116, 134, textureX, textureY); // Box 314
		bodyModel[135] = new ModelRendererTurbo(this, 192, 134, textureX, textureY); // Box 315
		bodyModel[136] = new ModelRendererTurbo(this, 192, 136, textureX, textureY); // Box 316
		bodyModel[137] = new ModelRendererTurbo(this, 395, 4, textureX, textureY); // Box 317
		bodyModel[138] = new ModelRendererTurbo(this, 20, 42, textureX, textureY); // Box 319
		bodyModel[139] = new ModelRendererTurbo(this, 1, 56, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[140] = new ModelRendererTurbo(this, 10, 56, textureX, textureY, "lamp"); // Box 176 glow
		bodyModel[141] = new ModelRendererTurbo(this, 84, 45, textureX, textureY); // Box 43
		bodyModel[142] = new ModelRendererTurbo(this, 44, 46, textureX, textureY); // Box 43
		bodyModel[143] = new ModelRendererTurbo(this, 75, 54, textureX, textureY); // Box 43
		bodyModel[144] = new ModelRendererTurbo(this, 119, 61, textureX, textureY); // Box 43
		bodyModel[145] = new ModelRendererTurbo(this, 119, 64, textureX, textureY); // Box 43
		bodyModel[146] = new ModelRendererTurbo(this, 1, 45, textureX, textureY); // Box 345
		bodyModel[147] = new ModelRendererTurbo(this, 75, 62, textureX, textureY); // Box 346 cover
		bodyModel[148] = new ModelRendererTurbo(this, 371, 22, textureX, textureY); // Box 100
		bodyModel[149] = new ModelRendererTurbo(this, 371, 15, textureX, textureY); // Box 101
		bodyModel[150] = new ModelRendererTurbo(this, 356, 22, textureX, textureY); // Box 102
		bodyModel[151] = new ModelRendererTurbo(this, 402, 22, textureX, textureY); // Box 103
		bodyModel[152] = new ModelRendererTurbo(this, 402, 15, textureX, textureY); // Box 104
		bodyModel[153] = new ModelRendererTurbo(this, 356, 15, textureX, textureY); // Box 105
		bodyModel[154] = new ModelRendererTurbo(this, 106, 54, textureX, textureY); // Box 355
		bodyModel[155] = new ModelRendererTurbo(this, 101, 55, textureX, textureY); // Box 356
		bodyModel[156] = new ModelRendererTurbo(this, 211, 30, textureX, textureY); // Box 379
		bodyModel[157] = new ModelRendererTurbo(this, 204, 34, textureX, textureY); // Box 380
		bodyModel[158] = new ModelRendererTurbo(this, 202, 31, textureX, textureY); // Box 381
		bodyModel[159] = new ModelRendererTurbo(this, 156, 35, textureX, textureY); // Box 384
		bodyModel[160] = new ModelRendererTurbo(this, 156, 32, textureX, textureY); // Box 385
		bodyModel[161] = new ModelRendererTurbo(this, 157, 29, textureX, textureY); // Box 386
		bodyModel[162] = new ModelRendererTurbo(this, 165, 32, textureX, textureY); // Box 387
		bodyModel[163] = new ModelRendererTurbo(this, 226, 68, textureX, textureY); // Box 388
		bodyModel[164] = new ModelRendererTurbo(this, 255, 12, textureX, textureY); // Box 389
		bodyModel[165] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 390
		bodyModel[166] = new ModelRendererTurbo(this, 257, 15, textureX, textureY); // Box 391
		bodyModel[167] = new ModelRendererTurbo(this, 257, 5, textureX, textureY, "lamp"); // Box 162 commander beacon
		bodyModel[168] = new ModelRendererTurbo(this, 256, 9, textureX, textureY); // Box 165
		bodyModel[169] = new ModelRendererTurbo(this, 184, 9, textureX, textureY); // Box 114
		bodyModel[170] = new ModelRendererTurbo(this, 184, 6, textureX, textureY); // Box 74
		bodyModel[171] = new ModelRendererTurbo(this, 184, 12, textureX, textureY); // Box 78
		bodyModel[172] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 78
		bodyModel[173] = new ModelRendererTurbo(this, 29, 163, textureX, textureY); // Box 188
		bodyModel[174] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, "lamp"); // Box 189 ditchlight front a
		bodyModel[175] = new ModelRendererTurbo(this, 29, 157, textureX, textureY, "lamp"); // Box 190 ditchlight front a
		bodyModel[176] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 239
		bodyModel[177] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, "lamp"); // Box 240 ditchlight rear a
		bodyModel[178] = new ModelRendererTurbo(this, 377, 181, textureX, textureY, "lamp"); // Box 241ditchlight rear a
		bodyModel[179] = new ModelRendererTurbo(this, 370, 182, textureX, textureY); // Box 242
		bodyModel[180] = new ModelRendererTurbo(this, 249, 19, textureX, textureY); // Box 409
		bodyModel[181] = new ModelRendererTurbo(this, 250, 15, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[182] = new ModelRendererTurbo(this, 340, 108, textureX, textureY); // Box 411
		bodyModel[183] = new ModelRendererTurbo(this, 342, 70, textureX, textureY); // Box 412
		bodyModel[184] = new ModelRendererTurbo(this, 362, 70, textureX, textureY); // Box 413
		bodyModel[185] = new ModelRendererTurbo(this, 354, 108, textureX, textureY); // Box 414
		bodyModel[186] = new ModelRendererTurbo(this, 250, 55, textureX, textureY); // Box 415
		bodyModel[187] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, "lamp"); // Box 416 ditchlight front b
		bodyModel[188] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 417
		bodyModel[189] = new ModelRendererTurbo(this, 19, 157, textureX, textureY, "lamp"); // Box 418 ditchlight front b
		bodyModel[190] = new ModelRendererTurbo(this, 19, 163, textureX, textureY); // Box 419
		bodyModel[191] = new ModelRendererTurbo(this, 33, 2, textureX, textureY); // box64
		bodyModel[192] = new ModelRendererTurbo(this, 81, 2, textureX, textureY); // box65
		bodyModel[193] = new ModelRendererTurbo(this, 73, 7, textureX, textureY); // Box 350
		bodyModel[194] = new ModelRendererTurbo(this, 55, 12, textureX, textureY); // Box 351
		bodyModel[195] = new ModelRendererTurbo(this, 175, 44, textureX, textureY); // Box 336
		bodyModel[196] = new ModelRendererTurbo(this, 184, 43, textureX, textureY, "lamp"); // Box 337 lamp
		bodyModel[197] = new ModelRendererTurbo(this, 172, 43, textureX, textureY, "lamp"); // Box 338 lamp
		bodyModel[198] = new ModelRendererTurbo(this, 185, 32, textureX, textureY); // Box 327
		bodyModel[199] = new ModelRendererTurbo(this, 187, 26, textureX, textureY); // Box 328
		bodyModel[200] = new ModelRendererTurbo(this, 187, 38, textureX, textureY); // Box 329
		bodyModel[201] = new ModelRendererTurbo(this, 196, 32, textureX, textureY); // Box 330
		bodyModel[202] = new ModelRendererTurbo(this, 189, 29, textureX, textureY); // Box 331
		bodyModel[203] = new ModelRendererTurbo(this, 189, 35, textureX, textureY); // Box 332
		bodyModel[204] = new ModelRendererTurbo(this, 267, 55, textureX, textureY); // Box 439
		bodyModel[205] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 451
		bodyModel[206] = new ModelRendererTurbo(this, 72, 132, textureX, textureY); // Box 452
		bodyModel[207] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 326
		bodyModel[208] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 327
		bodyModel[209] = new ModelRendererTurbo(this, 83, 136, textureX, textureY); // Box 329
		bodyModel[210] = new ModelRendererTurbo(this, 83, 129, textureX, textureY); // Box 330
		bodyModel[211] = new ModelRendererTurbo(this, 325, 147, textureX, textureY); // Box 19
		bodyModel[212] = new ModelRendererTurbo(this, 272, 116, textureX, textureY); // Box 334
		bodyModel[213] = new ModelRendererTurbo(this, 250, 8, textureX, textureY, "lamp"); // Box 340 commander beacon
		bodyModel[214] = new ModelRendererTurbo(this, 249, 12, textureX, textureY); // Box 341
		bodyModel[215] = new ModelRendererTurbo(this, 303, 114, textureX, textureY); // Box 629
		bodyModel[216] = new ModelRendererTurbo(this, 293, 114, textureX, textureY); // Box 630
		bodyModel[217] = new ModelRendererTurbo(this, 405, 123, textureX, textureY); // Box 726
		bodyModel[218] = new ModelRendererTurbo(this, 395, 123, textureX, textureY); // Box 727
		bodyModel[219] = new ModelRendererTurbo(this, 253, 51, textureX, textureY); // Box 369
		bodyModel[220] = new ModelRendererTurbo(this, 257, 60, textureX, textureY); // Box 370
		bodyModel[221] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 371
		bodyModel[222] = new ModelRendererTurbo(this, 260, 56, textureX, textureY); // Box 372
		bodyModel[223] = new ModelRendererTurbo(this, 263, 58, textureX, textureY); // Box 373
		bodyModel[224] = new ModelRendererTurbo(this, 263, 61, textureX, textureY); // Box 374
		bodyModel[225] = new ModelRendererTurbo(this, 442, 137, textureX, textureY); // Box 364
		bodyModel[226] = new ModelRendererTurbo(this, 190, 235, textureX, textureY); // Box 365
		bodyModel[227] = new ModelRendererTurbo(this, 190, 198, textureX, textureY); // Box 366
		bodyModel[228] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 372
		bodyModel[229] = new ModelRendererTurbo(this, 357, 169, textureX, textureY); // Box 373
		bodyModel[230] = new ModelRendererTurbo(this, 70, 136, textureX, textureY); // Box 374
		bodyModel[231] = new ModelRendererTurbo(this, 70, 129, textureX, textureY); // Box 375
		bodyModel[232] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 376
		bodyModel[233] = new ModelRendererTurbo(this, 467, 176, textureX, textureY); // Box 448
		bodyModel[234] = new ModelRendererTurbo(this, 482, 179, textureX, textureY); // Box 449
		bodyModel[235] = new ModelRendererTurbo(this, 56, 174, textureX, textureY); // Box 448
		bodyModel[236] = new ModelRendererTurbo(this, 71, 171, textureX, textureY); // Box 449
		bodyModel[237] = new ModelRendererTurbo(this, 478, 102, textureX, textureY); // Box 381 sp mount
		bodyModel[238] = new ModelRendererTurbo(this, 476, 94, textureX, textureY); // Box 31 sp mount
		bodyModel[239] = new ModelRendererTurbo(this, 491, 102, textureX, textureY, "lamp"); // Box 247 lamp gyralight rear
		bodyModel[240] = new ModelRendererTurbo(this, 471, 102, textureX, textureY, "lamp"); // Box 248 lamp gyralight rear
		bodyModel[241] = new ModelRendererTurbo(this, 471, 108, textureX, textureY, "lamp"); // Box 386 lamp rear
		bodyModel[242] = new ModelRendererTurbo(this, 491, 108, textureX, textureY, "lamp"); // Box 387lamp rear
		bodyModel[243] = new ModelRendererTurbo(this, 484, 90, textureX, textureY, "lamp"); // Box 388 light red gyralight rear
		bodyModel[244] = new ModelRendererTurbo(this, 487, 96, textureX, textureY); // Box 389 sp mount
		bodyModel[245] = new ModelRendererTurbo(this, 405, 159, textureX, textureY); // Box 390
		bodyModel[246] = new ModelRendererTurbo(this, 367, 159, textureX, textureY); // Box 391
		bodyModel[247] = new ModelRendererTurbo(this, 471, 92, textureX, textureY); // Box 392
		bodyModel[248] = new ModelRendererTurbo(this, 491, 92, textureX, textureY); // Box 393
		bodyModel[249] = new ModelRendererTurbo(this, 17, 101, textureX, textureY); // Box 42
		bodyModel[250] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 45
		bodyModel[251] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 42
		bodyModel[252] = new ModelRendererTurbo(this, 22, 73, textureX, textureY); // Box 48 lamp but not
		bodyModel[253] = new ModelRendererTurbo(this, 1, 51, textureX, textureY, "lamp"); // Box 294 lamp drgw
		bodyModel[254] = new ModelRendererTurbo(this, 1, 46, textureX, textureY, "lamp"); // Box 295 lamp drgw
		bodyModel[255] = new ModelRendererTurbo(this, 21, 82, textureX, textureY); // Box 296 nose cover
		bodyModel[256] = new ModelRendererTurbo(this, 26, 83, textureX, textureY); // Box 298
		bodyModel[257] = new ModelRendererTurbo(this, 27, 82, textureX, textureY); // Box 299 nose cover
		bodyModel[258] = new ModelRendererTurbo(this, 3, 73, textureX, textureY); // Box 318
		bodyModel[259] = new ModelRendererTurbo(this, 31, 73, textureX, textureY); // Box 319
		bodyModel[260] = new ModelRendererTurbo(this, 42, 50, textureX, textureY, "lamp"); // Box 314 lamp sp
		bodyModel[261] = new ModelRendererTurbo(this, 30, 50, textureX, textureY, "lamp"); // Box 315 lamp sp
		bodyModel[262] = new ModelRendererTurbo(this, 48, 47, textureX, textureY, "lamp"); // Box 316 lamp sp gyralight
		bodyModel[263] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 317
		bodyModel[264] = new ModelRendererTurbo(this, 405, 247, textureX, textureY); // Box 20
		bodyModel[265] = new ModelRendererTurbo(this, 168, 22, textureX, textureY); // Box 297
		bodyModel[266] = new ModelRendererTurbo(this, 475, 76, textureX, textureY); // Box 298 drgw mount
		bodyModel[267] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 299 lamp drgw rear
		bodyModel[268] = new ModelRendererTurbo(this, 475, 83, textureX, textureY, "lamp"); // Box 300 lamp drgw rear
		bodyModel[269] = new ModelRendererTurbo(this, 218, 12, textureX, textureY); // Box 409
		bodyModel[270] = new ModelRendererTurbo(this, 219, 8, textureX, textureY, "lamp"); // Box 410 commander beacon
		bodyModel[271] = new ModelRendererTurbo(this, 172, 32, textureX, textureY); // Box 303
		bodyModel[272] = new ModelRendererTurbo(this, 179, 31, textureX, textureY); // Box 304
		bodyModel[273] = new ModelRendererTurbo(this, 172, 29, textureX, textureY); // Box 305
		bodyModel[274] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 306
		bodyModel[275] = new ModelRendererTurbo(this, 221, 35, textureX, textureY); // Box 307
		bodyModel[276] = new ModelRendererTurbo(this, 223, 32, textureX, textureY); // Box 308
		bodyModel[277] = new ModelRendererTurbo(this, 230, 31, textureX, textureY); // Box 309
		bodyModel[278] = new ModelRendererTurbo(this, 223, 29, textureX, textureY); // Box 310
		bodyModel[279] = new ModelRendererTurbo(this, 482, 75, textureX, textureY); // Box 313 drgw mount
		bodyModel[280] = new ModelRendererTurbo(this, 471, 144, textureX, textureY); // Box 314
		bodyModel[281] = new ModelRendererTurbo(this, 208, 23, textureX, textureY); // Box 320
		bodyModel[282] = new ModelRendererTurbo(this, 208, 20, textureX, textureY); // Box 321
		bodyModel[283] = new ModelRendererTurbo(this, 205, 15, textureX, textureY); // Box 323
		bodyModel[284] = new ModelRendererTurbo(this, 205, 19, textureX, textureY); // Box 324
		bodyModel[285] = new ModelRendererTurbo(this, 83, 146, textureX, textureY); // Box 272
		bodyModel[286] = new ModelRendererTurbo(this, 83, 141, textureX, textureY); // Box 273
		bodyModel[287] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 275
		bodyModel[288] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 276
		bodyModel[289] = new ModelRendererTurbo(this, 85, 144, textureX, textureY); // Box 329
		bodyModel[290] = new ModelRendererTurbo(this, 85, 139, textureX, textureY); // Box 330
		bodyModel[291] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 331
		bodyModel[292] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 332
		bodyModel[293] = new ModelRendererTurbo(this, 72, 144, textureX, textureY); // Box 333
		bodyModel[294] = new ModelRendererTurbo(this, 70, 146, textureX, textureY); // Box 334
		bodyModel[295] = new ModelRendererTurbo(this, 70, 141, textureX, textureY); // Box 335
		bodyModel[296] = new ModelRendererTurbo(this, 72, 139, textureX, textureY); // Box 336
		bodyModel[297] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, "lamp"); // Box 337 ditchlight rear b
		bodyModel[298] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 338
		bodyModel[299] = new ModelRendererTurbo(this, 360, 189, textureX, textureY); // Box 339
		bodyModel[300] = new ModelRendererTurbo(this, 360, 184, textureX, textureY, "lamp"); // Box 340 ditchlight rear b
		bodyModel[301] = new ModelRendererTurbo(this, 196, 15, textureX, textureY); // Box 341
		bodyModel[302] = new ModelRendererTurbo(this, 198, 18, textureX, textureY); // Box 342
		bodyModel[303] = new ModelRendererTurbo(this, 190, 12, textureX, textureY); // Box 114
		bodyModel[304] = new ModelRendererTurbo(this, 190, 9, textureX, textureY); // Box 74
		bodyModel[305] = new ModelRendererTurbo(this, 190, 15, textureX, textureY); // Box 78
		bodyModel[306] = new ModelRendererTurbo(this, 189, 5, textureX, textureY); // Box 245
		bodyModel[307] = new ModelRendererTurbo(this, 59, 214, textureX, textureY); // Box 340
		bodyModel[308] = new ModelRendererTurbo(this, 64, 203, textureX, textureY); // Box 341
		bodyModel[309] = new ModelRendererTurbo(this, 107, 214, textureX, textureY); // Box 342
		bodyModel[310] = new ModelRendererTurbo(this, 305, 158, textureX, textureY); // Box 233
		bodyModel[311] = new ModelRendererTurbo(this, 305, 165, textureX, textureY); // Box 234
		bodyModel[312] = new ModelRendererTurbo(this, 306, 130, textureX, textureY); // Box 235
		bodyModel[313] = new ModelRendererTurbo(this, 306, 138, textureX, textureY); // Box 236
		bodyModel[314] = new ModelRendererTurbo(this, 254, 114, textureX, textureY); // Box 335
		bodyModel[315] = new ModelRendererTurbo(this, 254, 121, textureX, textureY); // Box 336
		bodyModel[316] = new ModelRendererTurbo(this, 237, 131, textureX, textureY); // Box 338
		bodyModel[317] = new ModelRendererTurbo(this, 237, 124, textureX, textureY); // Box 339
		bodyModel[318] = new ModelRendererTurbo(this, 304, 152, textureX, textureY); // Box 278
		bodyModel[319] = new ModelRendererTurbo(this, 304, 123, textureX, textureY); // Box 315
		bodyModel[320] = new ModelRendererTurbo(this, 253, 108, textureX, textureY); // Box 382
		bodyModel[321] = new ModelRendererTurbo(this, 236, 118, textureX, textureY); // Box 383
		bodyModel[322] = new ModelRendererTurbo(this, 156, 203, textureX, textureY); // Box 299 big radiator
		bodyModel[323] = new ModelRendererTurbo(this, 156, 227, textureX, textureY); // Box 300 big radiator
		bodyModel[324] = new ModelRendererTurbo(this, 185, 219, textureX, textureY); // Box 306
		bodyModel[325] = new ModelRendererTurbo(this, 185, 211, textureX, textureY); // Box 308
		bodyModel[326] = new ModelRendererTurbo(this, 58, 218, textureX, textureY, "cull"); // Box 304 vent cull
		bodyModel[327] = new ModelRendererTurbo(this, 58, 238, textureX, textureY, "cull"); // Box 305 vent cull
		bodyModel[328] = new ModelRendererTurbo(this, 119, 162, textureX, textureY); // Box 412
		bodyModel[329] = new ModelRendererTurbo(this, 96, 164, textureX, textureY); // Box 413
		bodyModel[330] = new ModelRendererTurbo(this, 96, 157, textureX, textureY); // Box 86
		bodyModel[331] = new ModelRendererTurbo(this, 226, 12, textureX, textureY); // Box 364 prime base
		bodyModel[332] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 6 PRIME1-1
		bodyModel[333] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 7 PRIME1-3
		bodyModel[334] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 8 PRIME1-2
		bodyModel[335] = new ModelRendererTurbo(this, 226, 8, textureX, textureY, "lamp"); // Box 9 PRIME1-4
		bodyModel[336] = new ModelRendererTurbo(this, 225, 16, textureX, textureY, "cull"); // Box 356 support cull
		bodyModel[337] = new ModelRendererTurbo(this, 131, 76, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[338] = new ModelRendererTurbo(this, 131, 70, textureX, textureY); // Box 5
		bodyModel[339] = new ModelRendererTurbo(this, 192, 100, textureX, textureY); // Box 260
		bodyModel[340] = new ModelRendererTurbo(this, 190, 105, textureX, textureY); // Box 264
		bodyModel[341] = new ModelRendererTurbo(this, 181, 99, textureX, textureY); // Box 268
		bodyModel[342] = new ModelRendererTurbo(this, 189, 98, textureX, textureY); // Box 274
		bodyModel[343] = new ModelRendererTurbo(this, 180, 105, textureX, textureY); // Box 283
		bodyModel[344] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 284
		bodyModel[345] = new ModelRendererTurbo(this, 206, 105, textureX, textureY); // Box 291
		bodyModel[346] = new ModelRendererTurbo(this, 219, 105, textureX, textureY); // Box 292
		bodyModel[347] = new ModelRendererTurbo(this, 218, 98, textureX, textureY); // Box 293
		bodyModel[348] = new ModelRendererTurbo(this, 220, 99, textureX, textureY); // Box 294
		bodyModel[349] = new ModelRendererTurbo(this, 213, 100, textureX, textureY); // Box 295
		bodyModel[350] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 296
		bodyModel[351] = new ModelRendererTurbo(this, 118, 164, textureX, textureY); // Box 527 cab backpannel
		bodyModel[352] = new ModelRendererTurbo(this, 321, 239, textureX, textureY); // Box 352
		bodyModel[353] = new ModelRendererTurbo(this, 322, 221, textureX, textureY); // Box 353
		bodyModel[354] = new ModelRendererTurbo(this, 322, 230, textureX, textureY); // Box 354
		bodyModel[355] = new ModelRendererTurbo(this, 345, 239, textureX, textureY); // Box 355
		bodyModel[356] = new ModelRendererTurbo(this, 346, 229, textureX, textureY); // Box 356
		bodyModel[357] = new ModelRendererTurbo(this, 346, 219, textureX, textureY); // Box 357
		bodyModel[358] = new ModelRendererTurbo(this, 368, 227, textureX, textureY); // Box 358
		bodyModel[359] = new ModelRendererTurbo(this, 366, 232, textureX, textureY); // Box 359
		bodyModel[360] = new ModelRendererTurbo(this, 366, 224, textureX, textureY); // Box 360
		bodyModel[361] = new ModelRendererTurbo(this, 371, 224, textureX, textureY); // Box 361
		bodyModel[362] = new ModelRendererTurbo(this, 377, 233, textureX, textureY, "lamp"); // Box 362 glow snoot
		bodyModel[363] = new ModelRendererTurbo(this, 377, 236, textureX, textureY, "lamp"); // Box 363 glow snooot
		bodyModel[364] = new ModelRendererTurbo(this, 377, 230, textureX, textureY); // Box 364
		bodyModel[365] = new ModelRendererTurbo(this, 394, 235, textureX, textureY, "lamp"); // Box 365 lamp snoot
		bodyModel[366] = new ModelRendererTurbo(this, 394, 230, textureX, textureY, "lamp"); // Box 366 lamp snoot
		bodyModel[367] = new ModelRendererTurbo(this, 33, 51, textureX, textureY); // Box 20
		bodyModel[368] = new ModelRendererTurbo(this, 406, 241, textureX, textureY); // Box 368 
		bodyModel[369] = new ModelRendererTurbo(this, 408, 231, textureX, textureY, "lamp"); // Box 369 lamp sp gyralight snoot
		bodyModel[370] = new ModelRendererTurbo(this, 408, 226, textureX, textureY, "lamp"); // Box 370 lamp sp snoot
		bodyModel[371] = new ModelRendererTurbo(this, 408, 236, textureX, textureY, "lamp"); // Box 371 lamp sp snoot
		bodyModel[372] = new ModelRendererTurbo(this, 384, 224, textureX, textureY); // Box 384
		bodyModel[373] = new ModelRendererTurbo(this, 377, 221, textureX, textureY); // Box 385
		bodyModel[374] = new ModelRendererTurbo(this, 377, 224, textureX, textureY); // Box 386
		bodyModel[375] = new ModelRendererTurbo(this, 384, 210, textureX, textureY); // Box 387
		bodyModel[376] = new ModelRendererTurbo(this, 339, 129, textureX, textureY); // Box 376
		bodyModel[377] = new ModelRendererTurbo(this, 420, 245, textureX, textureY); // Box 429
		bodyModel[378] = new ModelRendererTurbo(this, 423, 237, textureX, textureY); // Box 538

		bodyModel[0].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(-44F, 0F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 90, 4, 14, 0F); // Box 23
		bodyModel[1].setRotationPoint(-46F, 0F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 40, 2, 4, 0F); // Box 36
		bodyModel[2].setRotationPoint(-19F, -2F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 64, 21, 14, 0F); // Box 34
		bodyModel[3].setRotationPoint(-19F, -21F, -7F);

		bodyModel[4].addBox(0F, 0F, 0F, 21, 6, 16, 0F); // Box 112
		bodyModel[4].setRotationPoint(-9.5F, 3F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 164
		bodyModel[5].setRotationPoint(-45F, 2F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 0, 7, 20, 0F); // Box 3
		bodyModel[6].setRotationPoint(-49.01F, 0F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 259
		bodyModel[7].setRotationPoint(-45F, 2F, 7F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 262
		bodyModel[8].setRotationPoint(-45F, 0F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 264
		bodyModel[9].setRotationPoint(-45F, 5F, -11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 265
		bodyModel[10].setRotationPoint(-45F, 5F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 261
		bodyModel[11].setRotationPoint(-45F, 0F, -11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[12].setRotationPoint(-49.01F, -8F, -8F);
		bodyModel[12].rotateAngleY = -3.14159265F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 0, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[13].setRotationPoint(-49.01F, -8F, 8F);

		bodyModel[14].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[14].setRotationPoint(-49F, -2F, 10F);

		bodyModel[15].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[15].setRotationPoint(-49F, -2F, -11F);

		bodyModel[16].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 4
		bodyModel[16].setRotationPoint(-53F, 3F, -1.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 0, 4, 0F); // Box 98
		bodyModel[17].setRotationPoint(-53.01F, 0F, -2F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 3, 14, 0F); // Box 197
		bodyModel[18].setRotationPoint(-49F, 0F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyModel[19].setRotationPoint(-49F, -8F, -7F);

		bodyModel[20].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 144
		bodyModel[20].setRotationPoint(-49F, -8F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 0, 8, 8, 0F); // Box 145
		bodyModel[21].setRotationPoint(-50F, -8F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 0, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[22].setRotationPoint(-49F, -8F, 4F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 8, 1, 0F); // Box 148
		bodyModel[23].setRotationPoint(-49F, -8F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[24].setRotationPoint(-52F, 7F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[25].setRotationPoint(-52F, 4F, 2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F); // Box 4
		bodyModel[26].setRotationPoint(-52F, 8F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[27].setRotationPoint(-52F, 7F, -10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2F, 1F, 0F, -0.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F); // Box 4
		bodyModel[28].setRotationPoint(-52.5F, 4F, -10F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F); // Box 4
		bodyModel[29].setRotationPoint(-52F, 8F, -10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[30].setRotationPoint(-50F, 2.5F, -2F);

		bodyModel[31].addBox(0F, 0F, 0F, 88, 1, 4, 0F); // Box 159
		bodyModel[31].setRotationPoint(-44F, 0F, 7F);

		bodyModel[32].addBox(0F, 0F, 0F, 0, 7, 18, 0F); // Box 3
		bodyModel[32].setRotationPoint(48F, 0F, -9F);

		bodyModel[33].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 246
		bodyModel[33].setRotationPoint(48.01F, 2F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 3, 18, 0F); // Box 266
		bodyModel[34].setRotationPoint(44F, 0F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 4
		bodyModel[35].setRotationPoint(43F, 2F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 5
		bodyModel[36].setRotationPoint(48F, 3F, -1.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 0, 8, 22, 0F); // Box 80
		bodyModel[37].setRotationPoint(50.01F, -8F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 0, 4, 0F); // Box 179
		bodyModel[38].setRotationPoint(49F, 0F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[39].setRotationPoint(48F, 7F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-3F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, -1F, 1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[40].setRotationPoint(48F, 4F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, -1F); // Box 4
		bodyModel[41].setRotationPoint(48F, 8F, 0F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[42].setRotationPoint(48F, 7F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.5F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F); // Box 4
		bodyModel[43].setRotationPoint(48.5F, 4F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, 1F, 0F, 0F, -3.5F, 0F, 0F); // Box 4
		bodyModel[44].setRotationPoint(48F, 8F, -10F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[45].setRotationPoint(48F, 2.5F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[46].setRotationPoint(-49F, 2F, -3F);

		bodyModel[47].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[47].setRotationPoint(-30.5F, -18F, -10.5F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 70
		bodyModel[48].setRotationPoint(-20F, -18F, -11F);

		bodyModel[49].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 72
		bodyModel[49].setRotationPoint(-30F, -18F, 10F);

		bodyModel[50].addBox(0F, 0F, 0F, 10, 14, 1, 0F); // Box 190
		bodyModel[50].setRotationPoint(-30F, -18F, -11F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 14, 18, 0F); // Box 313
		bodyModel[51].setRotationPoint(-31F, -18F, -7F);

		bodyModel[52].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[52].setRotationPoint(-19.5F, -18F, 10.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 12, 4, 22, 0F); // Box 316
		bodyModel[53].setRotationPoint(-31F, -4F, -11F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 5, 2, 0F); // Box 201
		bodyModel[54].setRotationPoint(48.01F, 2F, 9F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 22, 0F); // Box 202
		bodyModel[55].setRotationPoint(48F, 0F, -11F);

		bodyModel[56].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 207
		bodyModel[56].setRotationPoint(48F, 7F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[57].setRotationPoint(-31F, -21F, -11F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[58].setRotationPoint(-20F, -21F, -11F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 211
		bodyModel[59].setRotationPoint(-31F, -21F, -7F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Box 48
		bodyModel[60].setRotationPoint(-33F, -21F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[61].setRotationPoint(-33F, -21F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 44
		bodyModel[62].setRotationPoint(-33F, -21F, 1F);

		bodyModel[63].addBox(0F, 0F, 0F, 0, 2, 5, 0F); // Box 117 liveryimg 2 glow
		bodyModel[63].setRotationPoint(-31.05F, -19.5F, -6F);
		bodyModel[63].rotateAngleY = 0.38397244F;

		bodyModel[64].addBox(0F, 0F, -5F, 0, 2, 5, 0F); // Box 118 liveryimg 2 glow
		bodyModel[64].setRotationPoint(-31.05F, -19.5F, 6F);
		bodyModel[64].rotateAngleY = -0.38397244F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 headlight front
		bodyModel[65].setRotationPoint(-33.5F, -21F, -1F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 headlight front
		bodyModel[66].setRotationPoint(-33.5F, -19F, -1F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Box 219
		bodyModel[67].setRotationPoint(-20F, -21F, -7F);

		bodyModel[68].addBox(0F, 0F, 0F, 10, 1, 14, 0F); // Box 220
		bodyModel[68].setRotationPoint(-30F, -21F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 221
		bodyModel[69].setRotationPoint(-30F, -21F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 222
		bodyModel[70].setRotationPoint(-30F, -21F, 7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[71].setRotationPoint(-20F, -21F, 7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[72].setRotationPoint(-31F, -21F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 225
		bodyModel[73].setRotationPoint(48F, 8F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 0, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 226
		bodyModel[74].setRotationPoint(-49F, 8F, -10F);

		bodyModel[75].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 227
		bodyModel[75].setRotationPoint(-49F, 7F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 229
		bodyModel[76].setRotationPoint(-44F, 1F, -11F);

		bodyModel[77].addBox(0F, 0F, 0F, 30, 1, 4, 0F); // Box 230
		bodyModel[77].setRotationPoint(-44F, 1F, 7F);

		bodyModel[78].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 231
		bodyModel[78].setRotationPoint(13F, 1F, 7F);

		bodyModel[79].addBox(0F, 0F, 0F, 31, 1, 4, 0F); // Box 232
		bodyModel[79].setRotationPoint(13F, 1F, -11F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[80].setRotationPoint(-7F, 1F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 87
		bodyModel[81].setRotationPoint(-7F, 2F, 9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 255
		bodyModel[82].setRotationPoint(-7F, 2F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[83].setRotationPoint(-7F, 1F, -11F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[84].setRotationPoint(-14F, 1F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[85].setRotationPoint(-14F, 1F, 7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[86].setRotationPoint(12F, 1F, 7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 244
		bodyModel[87].setRotationPoint(12F, 1F, -11F);

		bodyModel[88].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 245
		bodyModel[88].setRotationPoint(-38F, -4F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 246
		bodyModel[89].setRotationPoint(-38F, -4F, 7F);

		bodyModel[90].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 81
		bodyModel[90].setRotationPoint(-45F, -8F, -11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 81
		bodyModel[91].setRotationPoint(-45F, -6F, -11.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 0, 6, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 176
		bodyModel[92].setRotationPoint(-45F, -6F, 10.5F);

		bodyModel[93].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 177
		bodyModel[93].setRotationPoint(-45F, -8F, 9F);

		bodyModel[94].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 271
		bodyModel[94].setRotationPoint(-49F, 1F, -8F);

		bodyModel[95].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 274
		bodyModel[95].setRotationPoint(-49F, 3F, -9F);

		bodyModel[96].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 258
		bodyModel[96].setRotationPoint(-45F, -8F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 260
		bodyModel[97].setRotationPoint(-37F, -12F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[98].setRotationPoint(-41F, -8F, -11F);

		bodyModel[99].addBox(0F, 0F, 0F, 4, 8, 0, 0F); // Box 265
		bodyModel[99].setRotationPoint(-45F, -8F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[100].setRotationPoint(-41F, -8F, 11F);

		bodyModel[101].addBox(0F, 0F, 0F, 6, 8, 0, 0F); // Box 267
		bodyModel[101].setRotationPoint(-37F, -12F, 11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[102].setRotationPoint(-51F, 0F, -7F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 269
		bodyModel[103].setRotationPoint(-51F, 0F, 0F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 8, 3, 0F); // Box 270
		bodyModel[104].setRotationPoint(-19F, -10F, -10F);

		bodyModel[105].addBox(0F, 0F, 0F, 8, 11, 2, 0F); // Box 271
		bodyModel[105].setRotationPoint(-16F, -13F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[106].setRotationPoint(-16F, -15F, -9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 273
		bodyModel[107].setRotationPoint(-17F, -22F, -6F);

		bodyModel[108].addBox(0F, 0F, 0F, 2, 1, 5, 0F); // Box 274
		bodyModel[108].setRotationPoint(-8F, -22.5F, -2.5F);

		bodyModel[109].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Box 275
		bodyModel[109].setRotationPoint(-9F, -21.5F, -4F);

		bodyModel[110].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 278
		bodyModel[110].setRotationPoint(-3F, -22F, -3F);

		bodyModel[111].addBox(0F, 0F, 0F, 6, 1, 6, 0F); // Box 280
		bodyModel[111].setRotationPoint(4F, -22F, -3F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 281
		bodyModel[112].setRotationPoint(-39F, -4F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[113].setRotationPoint(-40F, -4F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[114].setRotationPoint(-40F, -4F, 11F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 284
		bodyModel[115].setRotationPoint(-39F, -4F, 11F);

		bodyModel[116].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 285
		bodyModel[116].setRotationPoint(-18F, -20.5F, -7.5F);

		bodyModel[117].addBox(0F, 0F, 0F, 9, 5, 1, 0F); // Box 286
		bodyModel[117].setRotationPoint(-18F, -20.5F, 6.5F);

		bodyModel[118].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 288
		bodyModel[118].setRotationPoint(44F, 2F, -11F);

		bodyModel[119].addBox(0F, 0F, 0F, 59, 8, 0, 0F); // Box 291
		bodyModel[119].setRotationPoint(-15F, -8F, 11F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 4, 4, 0F); // Box 292
		bodyModel[120].setRotationPoint(-19F, -4F, 7F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 4, 0, 0F); // Box 293
		bodyModel[121].setRotationPoint(-17F, -4F, 11F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[122].setRotationPoint(-16F, -4F, 11F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 295
		bodyModel[123].setRotationPoint(-19F, -12F, 11F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F); // Box 296
		bodyModel[124].setRotationPoint(-18F, -10F, 11F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 302
		bodyModel[125].setRotationPoint(-50F, 0F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[126].setRotationPoint(-50F, 0F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 304
		bodyModel[127].setRotationPoint(-50F, 0F, -6F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 308
		bodyModel[128].setRotationPoint(-19F, -21F, -11F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[129].setRotationPoint(-9F, -21F, -11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 310
		bodyModel[130].setRotationPoint(-19F, -21F, 7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[131].setRotationPoint(-9F, -21F, 7F);

		bodyModel[132].addBox(0F, 0F, 0F, 36, 8, 0, 0F); // Box 312
		bodyModel[132].setRotationPoint(-16F, -10F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[133].setRotationPoint(-18F, -12F, -11F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 314
		bodyModel[134].setRotationPoint(-19F, -12F, -11F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[135].setRotationPoint(20F, -10F, -11F);

		bodyModel[136].addBox(0F, 0F, 0F, 22, 8, 0, 0F); // Box 316
		bodyModel[136].setRotationPoint(22F, -8F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Box 317
		bodyModel[137].setRotationPoint(12F, -22F, -1F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 319
		bodyModel[138].setRotationPoint(-42F, -13.5F, -0.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[139].setRotationPoint(-41.9F, -11.5F, 5.5F);
		bodyModel[139].rotateAngleY = -0.43633231F;

		bodyModel[140].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 176 glow
		bodyModel[140].setRotationPoint(-41.9F, -11.5F, -5.5F);
		bodyModel[140].rotateAngleY = 0.43633231F;

		bodyModel[141].addBox(0F, 0F, 0F, 1, 13, 14, 0F); // Box 43
		bodyModel[141].setRotationPoint(-41F, -13F, -7F);

		bodyModel[142].addBox(0F, 0F, 0F, 2, 13, 13, 0F); // Box 43
		bodyModel[142].setRotationPoint(-40F, -13F, -6F);

		bodyModel[143].addBox(0F, 0F, 0F, 2, 4, 1, 0F); // Box 43
		bodyModel[143].setRotationPoint(-40F, -13F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[144].setRotationPoint(-39.5F, -8.5F, -7F);

		bodyModel[145].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 43
		bodyModel[145].setRotationPoint(-39F, -6.5F, -7F);

		bodyModel[146].addBox(0F, 0F, 0F, 7, 13, 14, 0F); // Box 345
		bodyModel[146].setRotationPoint(-38F, -13F, -7F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 9, 1, 0F); // Box 346 cover
		bodyModel[147].setRotationPoint(-40F, -9F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[148].setRotationPoint(-3F, -21F, -9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 101
		bodyModel[149].setRotationPoint(-3F, -21F, 7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -1.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.7F, 0F); // Box 102
		bodyModel[150].setRotationPoint(-8F, -21F, -9F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[151].setRotationPoint(10F, -21F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, -1F); // Box 104
		bodyModel[152].setRotationPoint(10F, -21F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.7F, -1.75F); // Box 105
		bodyModel[153].setRotationPoint(-8F, -21F, 7F);

		bodyModel[154].addBox(0F, 0F, 0F, 3, 3, 0, 0F); // Box 355
		bodyModel[154].setRotationPoint(-40F, -12F, -7.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 356
		bodyModel[155].setRotationPoint(-39F, -11F, -7.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[156].setRotationPoint(12F, -22.5F, -6F);

		bodyModel[157].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 380
		bodyModel[157].setRotationPoint(11F, -23.5F, -5.75F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 381
		bodyModel[158].setRotationPoint(10F, -23.5F, -4.25F);

		bodyModel[159].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[159].setRotationPoint(-33.75F, -23F, -1.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[160].setRotationPoint(-32.25F, -23F, -0.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[161].setRotationPoint(-33F, -23F, 0.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[162].setRotationPoint(-32F, -22.5F, -0.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 5, 2, 8, 0F); // Box 388
		bodyModel[163].setRotationPoint(-28F, -22.5F, -4F);

		bodyModel[164].addBox(0F, 0F, 0F, 2, 0, 2, 0F); // Box 389
		bodyModel[164].setRotationPoint(-30F, -22F, -9F);

		bodyModel[165].addBox(0F, 0F, 0F, 2, 3, 0, 0F); // Box 390
		bodyModel[165].setRotationPoint(-30F, -22F, -9F);

		bodyModel[166].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Box 391
		bodyModel[166].setRotationPoint(-30F, -22F, -7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 162 commander beacon
		bodyModel[167].setRotationPoint(-29.5F, -24F, -8.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 165
		bodyModel[168].setRotationPoint(-29.32F, -23F, -8.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[169].setRotationPoint(-15F, 3F, -10.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[170].setRotationPoint(-15F, 2F, -10.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[171].setRotationPoint(-14.75F, 3.5F, -10.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[172].setRotationPoint(-49F, -2F, 4.75F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[173].setRotationPoint(-49F, -2F, -6.75F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 189 ditchlight front a
		bodyModel[174].setRotationPoint(-49.25F, -2F, 4.75F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight front a
		bodyModel[175].setRotationPoint(-49.25F, -2F, -6.75F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 239
		bodyModel[176].setRotationPoint(49F, -2F, -6.75F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 240 ditchlight rear a
		bodyModel[177].setRotationPoint(49.25F, -2F, -6.75F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 241ditchlight rear a
		bodyModel[178].setRotationPoint(49.25F, -2F, 4.75F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 242
		bodyModel[179].setRotationPoint(49F, -2F, 4.75F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[180].setRotationPoint(-30.32F, -22F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[181].setRotationPoint(-30.5F, -23F, -0.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 411
		bodyModel[182].setRotationPoint(-30F, 2F, -11F);

		bodyModel[183].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 412
		bodyModel[183].setRotationPoint(-30F, 2F, 7F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 413
		bodyModel[184].setRotationPoint(27F, 2F, 7F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 1, 4, 0F); // Box 414
		bodyModel[185].setRotationPoint(27F, 2F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[186].setRotationPoint(-27F, -22F, 0F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 416 ditchlight front b
		bodyModel[187].setRotationPoint(-49.75F, 1F, -5.75F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[188].setRotationPoint(-49.5F, 1F, -5.75F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 418 ditchlight front b
		bodyModel[189].setRotationPoint(-49.75F, 1F, 3.75F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 419
		bodyModel[190].setRotationPoint(-49.5F, 1F, 3.75F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // box64
		bodyModel[191].setRotationPoint(-29F, -18F, 11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // box65
		bodyModel[192].setRotationPoint(-29F, -18F, -12F);

		bodyModel[193].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 350
		bodyModel[193].setRotationPoint(-28F, -16F, -12F);

		bodyModel[194].addBox(0F, 0F, 0F, 0, 4, 1, 0F); // Box 351
		bodyModel[194].setRotationPoint(-28F, -16F, 11F);

		bodyModel[195].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336
		bodyModel[195].setRotationPoint(-33F, -23F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 lamp
		bodyModel[196].setRotationPoint(-33.75F, -23F, 0F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 lamp
		bodyModel[197].setRotationPoint(-33.75F, -23F, -2F);

		bodyModel[198].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 327
		bodyModel[198].setRotationPoint(3.5F, -22.5F, -8.5F);

		bodyModel[199].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 328
		bodyModel[199].setRotationPoint(4.5F, -22.25F, -7.5F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 329
		bodyModel[200].setRotationPoint(4F, -22.25F, -9.5F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 330
		bodyModel[201].setRotationPoint(6F, -21.5F, -8.5F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 331
		bodyModel[202].setRotationPoint(5F, -23.5F, -7.75F);

		bodyModel[203].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 332
		bodyModel[203].setRotationPoint(5F, -23.5F, -9F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[204].setRotationPoint(-15F, -23F, -3F);

		bodyModel[205].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 451
		bodyModel[205].setRotationPoint(-49F, 3F, 7F);

		bodyModel[206].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 452
		bodyModel[206].setRotationPoint(-49F, 1F, 7F);

		bodyModel[207].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 326
		bodyModel[207].setRotationPoint(44F, 8F, -11F);

		bodyModel[208].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 327
		bodyModel[208].setRotationPoint(44F, 5.5F, -11F);

		bodyModel[209].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 329
		bodyModel[209].setRotationPoint(44F, 3F, -11F);

		bodyModel[210].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 330
		bodyModel[210].setRotationPoint(44F, 0F, -11F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 19
		bodyModel[211].setRotationPoint(-9.5F, 2F, -11.5F);
		bodyModel[211].rotateAngleX = 0.87266463F;

		bodyModel[212].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 334
		bodyModel[212].setRotationPoint(-9.5F, 3.5F, 8.75F);
		bodyModel[212].rotateAngleX = 0.87266463F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 340 commander beacon
		bodyModel[213].setRotationPoint(-26.5F, -23F, -0.5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 341
		bodyModel[214].setRotationPoint(-26.32F, -22F, -0.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 629
		bodyModel[215].setRotationPoint(-28F, 4F, -1F);

		bodyModel[216].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 630
		bodyModel[216].setRotationPoint(-35F, 4F, -1F);

		bodyModel[217].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 726
		bodyModel[217].setRotationPoint(32F, 4F, -1F);

		bodyModel[218].addBox(0F, 0F, 0F, 2, 1, 2, 0F); // Box 727
		bodyModel[218].setRotationPoint(25F, 4F, -1F);

		bodyModel[219].addBox(0F, 0F, 0F, 4, 0, 4, 0F); // Box 369
		bodyModel[219].setRotationPoint(-20F, -23F, 2F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 370
		bodyModel[220].setRotationPoint(-20F, -23F, 2F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 371
		bodyModel[221].setRotationPoint(-20F, -23F, 6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[222].setRotationPoint(-20F, -24F, 4F);

		bodyModel[223].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 373
		bodyModel[223].setRotationPoint(-17F, -23F, 6F);

		bodyModel[224].addBox(0F, 0F, 0F, 1, 1, 0, 0F); // Box 374
		bodyModel[224].setRotationPoint(-17F, -23F, 2F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 364
		bodyModel[225].setRotationPoint(49F, 0F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[226].setRotationPoint(21F, -21F, -8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 23, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 366
		bodyModel[227].setRotationPoint(21F, -21F, 7F);

		bodyModel[228].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 372
		bodyModel[228].setRotationPoint(44F, 5.5F, 9F);

		bodyModel[229].addBox(0F, 0F, 0F, 0, 6, 2, 0F); // Box 373
		bodyModel[229].setRotationPoint(44F, 2F, 9F);

		bodyModel[230].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 374
		bodyModel[230].setRotationPoint(44F, 3F, 9F);

		bodyModel[231].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 375
		bodyModel[231].setRotationPoint(44F, 0F, 9F);

		bodyModel[232].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Box 376
		bodyModel[232].setRotationPoint(44F, 8F, 9F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[233].setRotationPoint(48F, 5F, 2F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 449
		bodyModel[234].setRotationPoint(48F, 5F, -10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[235].setRotationPoint(-52F, 5F, 2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F); // Box 449
		bodyModel[236].setRotationPoint(-52F, 5F, -10F);

		bodyModel[237].addBox(0F, 0F, 0F, 2, 6, 4, 0F); // Box 381 sp mount
		bodyModel[237].setRotationPoint(44F, -22F, -2F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 31 sp mount
		bodyModel[238].setRotationPoint(46F, -20F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 247 lamp gyralight rear
		bodyModel[239].setRotationPoint(46.25F, -20F, -2F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 248 lamp gyralight rear
		bodyModel[240].setRotationPoint(46.25F, -20F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 386 lamp rear
		bodyModel[241].setRotationPoint(45.25F, -18F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 387lamp rear
		bodyModel[242].setRotationPoint(45.25F, -18F, -2F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 388 light red gyralight rear
		bodyModel[243].setRotationPoint(46.25F, -22F, -1F);

		bodyModel[244].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 389 sp mount
		bodyModel[244].setRotationPoint(46F, -22F, -1F);

		bodyModel[245].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 390
		bodyModel[245].setRotationPoint(48F, -8F, -11F);

		bodyModel[246].addBox(0F, 0F, 0F, 2, 8, 0, 0F); // Box 391
		bodyModel[246].setRotationPoint(48F, -8F, 11F);

		bodyModel[247].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 392
		bodyModel[247].setRotationPoint(45F, -16F, -6.25F);
		bodyModel[247].rotateAngleY = -0.36651914F;

		bodyModel[248].addShapeBox(-0.5F, 0F, -1F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 393
		bodyModel[248].setRotationPoint(45F, -16F, 6.25F);
		bodyModel[248].rotateAngleY = 0.36651914F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[249].setRotationPoint(-44F, -8F, -7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 45
		bodyModel[250].setRotationPoint(-44F, -8F, 0F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 42
		bodyModel[251].setRotationPoint(-44F, -10F, 1F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 48 lamp
		bodyModel[252].setRotationPoint(-42.98F, -13F, -1F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 294 lamp drgw
		bodyModel[253].setRotationPoint(-44F, -10F, -1F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 295 lamp drgw
		bodyModel[254].setRotationPoint(-44F, -12F, -1F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 296 nose cover
		bodyModel[255].setRotationPoint(-44F, -13F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 298
		bodyModel[256].setRotationPoint(-44F, -10F, -7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 299 nose cover
		bodyModel[257].setRotationPoint(-44F, -13F, -1F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 318
		bodyModel[258].setRotationPoint(-44F, -13F, 1F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 319
		bodyModel[259].setRotationPoint(-44F, -13F, -7F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 314 lamp sp
		bodyModel[260].setRotationPoint(-43.75F, -12F, -2F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 315 lamp sp
		bodyModel[261].setRotationPoint(-43.75F, -12F, 0F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 316 lamp sp gyralight
		bodyModel[262].setRotationPoint(-43.75F, -14F, -1F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 317
		bodyModel[263].setRotationPoint(-42.98F, -14F, -1.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[264].setRotationPoint(-47.15F, -13F, -2F);

		bodyModel[265].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 297
		bodyModel[265].setRotationPoint(-29F, -23F, 0F);

		bodyModel[266].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Box 298 drgw mount
		bodyModel[266].setRotationPoint(45F, -21F, -1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 299 lamp drgw rear
		bodyModel[267].setRotationPoint(45.25F, -21F, -1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 300 lamp drgw rear
		bodyModel[268].setRotationPoint(45.25F, -19F, -1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0.3F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 409
		bodyModel[269].setRotationPoint(-32.32F, -22F, -0.5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[270].setRotationPoint(-32.5F, -23F, -0.5F);

		bodyModel[271].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 303
		bodyModel[271].setRotationPoint(-30.5F, -23F, 2.5F);

		bodyModel[272].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 304
		bodyModel[272].setRotationPoint(-30.25F, -22.5F, 2.5F);

		bodyModel[273].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 305
		bodyModel[273].setRotationPoint(-31.25F, -23F, 3.5F);

		bodyModel[274].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 306
		bodyModel[274].setRotationPoint(-32F, -23F, 1.5F);

		bodyModel[275].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 307
		bodyModel[275].setRotationPoint(14F, -23F, -1.5F);

		bodyModel[276].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 308
		bodyModel[276].setRotationPoint(15.5F, -23F, -0.5F);

		bodyModel[277].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 309
		bodyModel[277].setRotationPoint(15.75F, -22.5F, -0.5F);

		bodyModel[278].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 310
		bodyModel[278].setRotationPoint(14.75F, -23F, 0.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 2, 5, 3, 0F); // Box 313 drgw mount
		bodyModel[279].setRotationPoint(43.5F, -21.5F, -1.5F);

		bodyModel[280].addBox(0F, 0F, 0F, 2, 2, 18, 0F); // Box 314
		bodyModel[280].setRotationPoint(48F, 7F, -9F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 320
		bodyModel[281].setRotationPoint(-30F, -22.5F, -6F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[282].setRotationPoint(-30F, -23.5F, -6F);

		bodyModel[283].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Box 323
		bodyModel[283].setRotationPoint(-29.5F, -24F, -5.75F);

		bodyModel[284].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 324
		bodyModel[284].setRotationPoint(-29.5F, -23F, -3.75F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[285].setRotationPoint(-49F, 8F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[286].setRotationPoint(-49F, 5F, -10F);

		bodyModel[287].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 275
		bodyModel[287].setRotationPoint(-49F, 7F, -9F);

		bodyModel[288].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 276
		bodyModel[288].setRotationPoint(-49F, 4F, -8F);

		bodyModel[289].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 329
		bodyModel[289].setRotationPoint(44F, 7F, -9F);

		bodyModel[290].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 330
		bodyModel[290].setRotationPoint(44F, 4.5F, -9F);

		bodyModel[291].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 331
		bodyModel[291].setRotationPoint(44F, 4.5F, 9F);

		bodyModel[292].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 332
		bodyModel[292].setRotationPoint(44F, 7F, 9F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 333
		bodyModel[293].setRotationPoint(-49F, 7F, 9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[294].setRotationPoint(-49F, 8F, 9F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 0, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[295].setRotationPoint(-49F, 5F, 8F);

		bodyModel[296].addBox(0F, 0F, 0F, 4, 1, 0, 0F); // Box 336
		bodyModel[296].setRotationPoint(-49F, 4F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 ditchlight rear b
		bodyModel[297].setRotationPoint(47.75F, 2F, 3.75F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 338
		bodyModel[298].setRotationPoint(47.5F, 2F, 3.75F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 339
		bodyModel[299].setRotationPoint(47.5F, 2F, -5.75F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 340 ditchlight rear b
		bodyModel[300].setRotationPoint(47.75F, 2F, -5.75F);

		bodyModel[301].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 341
		bodyModel[301].setRotationPoint(43F, -23.5F, 5.5F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 342
		bodyModel[302].setRotationPoint(43.5F, -22.5F, 5.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[303].setRotationPoint(13.5F, -19.5F, 7.7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[304].setRotationPoint(13.5F, -20.5F, 7.7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[305].setRotationPoint(13.75F, -19F, 7.95F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[306].setRotationPoint(13.5F, -21.5F, 6.5F);

		bodyModel[307].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 340
		bodyModel[307].setRotationPoint(25F, -9F, -7F);

		bodyModel[308].addBox(0F, 0F, 0F, 19, 0, 14, 0F); // Box 341
		bodyModel[308].setRotationPoint(25F, -9F, -7F);

		bodyModel[309].addBox(0F, 0F, 0F, 0, 9, 14, 0F); // Box 342
		bodyModel[309].setRotationPoint(44F, -9F, -7F);

		bodyModel[310].addBox(0F, 0F, 0F, 21, 3, 3, 0F); // Box 233
		bodyModel[310].setRotationPoint(-9.5F, 3F, -11F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[311].setRotationPoint(-9.5F, 6F, -11F);

		bodyModel[312].addBox(0F, 0F, 0F, 21, 3, 3, 0F); // Box 235
		bodyModel[312].setRotationPoint(-9.5F, 3F, 8F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 21, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 236
		bodyModel[313].setRotationPoint(-9.5F, 6F, 8F);

		bodyModel[314].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 335
		bodyModel[314].setRotationPoint(-12.5F, 3F, -11F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[315].setRotationPoint(-12.5F, 6F, -11F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 338
		bodyModel[316].setRotationPoint(-12.5F, 6F, 8F);

		bodyModel[317].addBox(0F, 0F, 0F, 3, 3, 3, 0F); // Box 339
		bodyModel[317].setRotationPoint(-12.5F, 3F, 8F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[318].setRotationPoint(-9.5F, 2F, -11F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 21, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[319].setRotationPoint(-9.5F, 2F, 7F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[320].setRotationPoint(-12.5F, 2F, -11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[321].setRotationPoint(-12.5F, 2F, 7F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 52, 1, 6, 0F,-0.25F, 1F, 0F, -29.25F, 1F, 0F, -29.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, -1F, 0F, -29.25F, -1F, 0F, -29.25F, 0F, 0.8F, -0.25F, 0F, 0.8F); // Box 299 big radiator
		bodyModel[322].setRotationPoint(21F, -21.75F, 0.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 52, 1, 6, 0F,-0.25F, 0F, 0.8F, -29.25F, 0F, 0.8F, -29.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0.8F, -29.25F, 0F, 0.8F, -29.25F, -1F, 0F, -0.25F, -1F, 0F); // Box 300 big radiator
		bodyModel[323].setRotationPoint(21F, -21.75F, -6.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 306
		bodyModel[324].setRotationPoint(21F, -22F, -7F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 23, 1, 6, 0F,0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 308
		bodyModel[325].setRotationPoint(21F, -22F, 1F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 304 vent cull
		bodyModel[326].setRotationPoint(25F, -8.5F, 6.25F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 38, 8, 1, 0F,0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F); // Box 305 vent cull
		bodyModel[327].setRotationPoint(25F, -8.5F, -7.25F);

		bodyModel[328].addBox(0F, 0F, 0F, 1, 9, 4, 0F); // Box 412
		bodyModel[328].setRotationPoint(-30F, -13F, -2F);

		bodyModel[329].addBox(0F, 0F, 0F, 7, 8, 3, 0F); // Box 413
		bodyModel[329].setRotationPoint(-30.1F, -12F, -4F);
		bodyModel[329].rotateAngleY = -0.38397244F;

		bodyModel[330].addShapeBox(-1F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86
		bodyModel[330].setRotationPoint(-28.5F, -14F, -4F);
		bodyModel[330].rotateAngleY = -0.38397244F;

		bodyModel[331].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364 prime base
		bodyModel[331].setRotationPoint(-30F, -22F, 7F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME1-1
		bodyModel[332].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME1-3
		bodyModel[333].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME1-2
		bodyModel[334].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME1-4
		bodyModel[335].setRotationPoint(-30F, -22.5F, 7F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356 support cull
		bodyModel[336].setRotationPoint(-30.5F, -21F, 7F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[337].setRotationPoint(-28F, -17F, 10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[338].setRotationPoint(-28F, -18F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[339].setRotationPoint(-25F, -28F, 6F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[340].setRotationPoint(-25F, -28F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 268
		bodyModel[341].setRotationPoint(-25F, -27F, 5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 274
		bodyModel[342].setRotationPoint(-25F, -27F, 8F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, -2F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F); // Box 283
		bodyModel[343].setRotationPoint(-25F, -25F, 7F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, -3F, 1F, -2F, -3F, 1F, 1F, -2F, -0.5F, 0F, -3F, -3F); // Box 284
		bodyModel[344].setRotationPoint(-25F, -25F, 5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, -2F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 1F, -2F, -0.5F, -2F, -3F, 1F, 0F, -3F, 1F); // Box 291
		bodyModel[345].setRotationPoint(-25F, -25F, -8F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 1F, -2F, 0F, 1F, 1F, -2F, -0.5F, 0F, 0F, -3F); // Box 292
		bodyModel[346].setRotationPoint(-25F, -25F, -10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 0F, 0F, -1F); // Box 293
		bodyModel[347].setRotationPoint(-25F, -27F, -9F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[348].setRotationPoint(-25F, -27F, -8F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[349].setRotationPoint(-25F, -28F, -8F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[350].setRotationPoint(-25F, -28F, -9F);

		bodyModel[351].addBox(0F, 0F, 0F, 1, 16, 12, 0F); // Box 527 cab backpannel
		bodyModel[351].setRotationPoint(-21F, -20F, -6F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[352].setRotationPoint(-48F, -8F, -7F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 353
		bodyModel[353].setRotationPoint(-48F, -10F, -7F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 354
		bodyModel[354].setRotationPoint(-48F, -10F, 1F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 355
		bodyModel[355].setRotationPoint(-48F, -8F, 0F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 356
		bodyModel[356].setRotationPoint(-48F, -13F, 1F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F); // Box 357
		bodyModel[357].setRotationPoint(-48F, -13F, -7F);

		bodyModel[358].addBox(0F, 0F, 0F, 4, 13, 14, 0F); // Box 358
		bodyModel[358].setRotationPoint(-45F, -13F, -7F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 359
		bodyModel[359].setRotationPoint(-46.98F, -13F, -1F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F, -0.42F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[360].setRotationPoint(-48F, -13F, -1F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F, 0F, 0F, 0F, -0.58F, 0F, 0F, -0.58F, 0F, 0F, -0.42F, 0F, 0F); // Box 361
		bodyModel[361].setRotationPoint(-48F, -13F, 0F);

		bodyModel[362].addBox(0F, 0F, -1F, 1, 1, 1, 0F); // Box 362 glow snoot
		bodyModel[362].setRotationPoint(-45.9F, -11.5F, -5.5F);
		bodyModel[362].rotateAngleY = 0.43633231F;

		bodyModel[363].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 363 glow snooot
		bodyModel[363].setRotationPoint(-45.9F, -11.5F, 5.5F);
		bodyModel[363].rotateAngleY = -0.43633231F;

		bodyModel[364].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 364
		bodyModel[364].setRotationPoint(-46F, -13.5F, -0.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 365 lamp snoot
		bodyModel[365].setRotationPoint(-48F, -10F, -1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 366 lamp snoot
		bodyModel[366].setRotationPoint(-48F, -12F, -1F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[367].setRotationPoint(-43.15F, -13F, -2F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 368 
		bodyModel[368].setRotationPoint(-46.98F, -14F, -1.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 369 lamp sp gyralight snoot
		bodyModel[369].setRotationPoint(-47.75F, -14F, -1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 370 lamp sp snoot
		bodyModel[370].setRotationPoint(-47.75F, -12F, 0F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 371 lamp sp snoot
		bodyModel[371].setRotationPoint(-47.75F, -12F, -2F);

		bodyModel[372].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 384
		bodyModel[372].setRotationPoint(-32F, -22.5F, 7F);

		bodyModel[373].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 385
		bodyModel[373].setRotationPoint(-31F, -22.5F, 5F);

		bodyModel[374].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 386
		bodyModel[374].setRotationPoint(-31.25F, -22.5F, 6F);

		bodyModel[375].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 387
		bodyModel[375].setRotationPoint(-30.25F, -22F, 6F);

		bodyModel[376].addBox(0F, 0F, 0F, 3, 6, 16, 0F); // Box 376
		bodyModel[376].setRotationPoint(-12.5F, 3F, -8F);

		bodyModel[377].addBox(0F, 0F, 0F, 8, 6, 3, 0F); // Box 429
		bodyModel[377].setRotationPoint(-41F, -10F, 7F);

		bodyModel[378].addBox(0F, 0F, 0F, 0, 4, 3, 0F); // Box 538
		bodyModel[378].setRotationPoint(-41F, -4F, 7F);
	}
	ModelFlexicoil_C2H theTrucks = new ModelFlexicoil_C2H();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < 379; i++) {
			if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("lamp")) {
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				bodyModel[i].render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			} else if (bodyModel[i].boxName != null && bodyModel[i].boxName.contains("cull")) {
				GL11.glDisable(GL11.GL_CULL_FACE);
				bodyModel[i].render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			} else {
				bodyModel[i].render(f5);
			}
		}
		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15435) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Blue.png"));
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 15344) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Grey.png"));
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/flexicoil_c2h_Black.png"));
		}
		GL11.glPushMatrix();
		GL11.glTranslatef(-2.05F, 0.01F, 0F);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		GL11.glRotatef(180, 0, 1, 0);
		GL11.glTranslated(-2.05F, 0.01F, 0);
		theTrucks.render(entity, f, f1, f2, f3, f4, f5);
		GL11.glPopMatrix();
	}
	public float[] getTrans() {
		return new float[]{-1.9F, 0.15F, 0F};
	}

	public float[] getRotate() {
		return new float[] { 0F, 180F, 180F };
	}

	public float[] getScale() {
		return null;
	}

	public ArrayList<double[]> getSmokePosition() {
		return new ArrayList<double[]>() {
			{
				add(new double[]{2.3D, 1.4D, 0.0D});
			}
		};
	}
}