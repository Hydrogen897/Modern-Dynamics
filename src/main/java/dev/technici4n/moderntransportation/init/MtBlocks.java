/*
 * Modern Transportation
 * Copyright (C) 2021 shartte & Technici4n
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package dev.technici4n.moderntransportation.init;

import dev.technici4n.moderntransportation.pipe.PipeBlock;
import dev.technici4n.moderntransportation.util.MtId;
import net.minecraft.util.registry.Registry;

public class MtBlocks {

    public static final PipeBlock BASIC_ITEM_PIPE = new PipeBlock("basic_item_pipe");
    public static final PipeBlock BASIC_ITEM_PIPE_OPAQUE = new PipeBlock("basic_item_pipe_opaque");
    public static final PipeBlock FAST_ITEM_PIPE = new PipeBlock("fast_item_pipe");
    public static final PipeBlock FAST_ITEM_PIPE_OPAQUE = new PipeBlock("fast_item_pipe_opaque");
    public static final PipeBlock CONDUCTIVE_ITEM_PIPE = new PipeBlock("conductive_item_pipe");
    public static final PipeBlock CONDUCTIVE_ITEM_PIPE_OPAQUE = new PipeBlock("conductive_item_pipe_opaque");
    public static final PipeBlock CONDUCTIVE_FAST_ITEM_PIPE = new PipeBlock("conductive_fast_item_pipe");
    public static final PipeBlock CONDUCTIVE_FAST_ITEM_PIPE_OPAQUE = new PipeBlock("conductive_fast_item_pipe_opaque");

    public static final PipeBlock BASIC_FLUID_PIPE = new PipeBlock("basic_fluid_pipe");
    public static final PipeBlock BASIC_FLUID_PIPE_OPAQUE = new PipeBlock("basic_fluid_pipe_opaque");
    public static final PipeBlock FAST_FLUID_PIPE = new PipeBlock("fast_fluid_pipe");
    public static final PipeBlock FAST_FLUID_PIPE_OPAQUE = new PipeBlock("fast_fluid_pipe_opaque");
    public static final PipeBlock CONDUCTIVE_FLUID_PIPE = new PipeBlock("conductive_fluid_pipe");
    public static final PipeBlock CONDUCTIVE_FLUID_PIPE_OPAQUE = new PipeBlock("conductive_fluid_pipe_opaque");
    public static final PipeBlock CONDUCTIVE_FAST_FLUID_PIPE = new PipeBlock("conductive_fast_fluid_pipe");
    public static final PipeBlock CONDUCTIVE_FAST_FLUID_PIPE_OPAQUE = new PipeBlock("conductive_fast_fluid_pipe_opaque");

    public static final PipeBlock BASIC_ENERGY_PIPE = new PipeBlock("basic_energy_pipe");
    public static final PipeBlock HARDENED_ENERGY_PIPE = new PipeBlock("hardened_energy_pipe");
    public static final PipeBlock REINFORCED_ENERGY_PIPE = new PipeBlock("reinforced_energy_pipe");
    public static final PipeBlock SIGNALUM_ENERGY_PIPE = new PipeBlock("signalum_energy_pipe");
    public static final PipeBlock RESONANT_ENERGY_PIPE = new PipeBlock("resonant_energy_pipe");
    public static final PipeBlock SUPERCONDUCTING_PIPE = new PipeBlock("superconducting_pipe");

    // These are modeled as blocks because they're placeable, but do not conduct energy
    public static final PipeBlock EMPTY_REINFORCED_ENERGY_PIPE = new PipeBlock("empty_reinforced_energy_pipe");
    public static final PipeBlock EMPTY_SIGNALUM_ENERGY_PIPE = new PipeBlock("empty_signalum_energy_pipe");
    public static final PipeBlock EMPTY_RESONANT_ENERGY_PIPE = new PipeBlock("empty_resonant_energy_pipe");
    public static final PipeBlock EMPTY_SUPERCONDUCTING_PIPE = new PipeBlock("empty_superconducting_pipe");

    public static final PipeBlock[] ALL_PIPES = new PipeBlock[] {
            // Item transport
            BASIC_ITEM_PIPE,
            BASIC_ITEM_PIPE_OPAQUE,
            FAST_ITEM_PIPE,
            FAST_ITEM_PIPE_OPAQUE,
            CONDUCTIVE_ITEM_PIPE,
            CONDUCTIVE_ITEM_PIPE_OPAQUE,
            CONDUCTIVE_FAST_ITEM_PIPE,
            CONDUCTIVE_FAST_ITEM_PIPE_OPAQUE,
            // Fluid transport
            BASIC_FLUID_PIPE,
            BASIC_FLUID_PIPE_OPAQUE,
            FAST_FLUID_PIPE,
            FAST_FLUID_PIPE_OPAQUE,
            CONDUCTIVE_FLUID_PIPE,
            CONDUCTIVE_FLUID_PIPE_OPAQUE,
            CONDUCTIVE_FAST_FLUID_PIPE,
            CONDUCTIVE_FAST_FLUID_PIPE_OPAQUE,
            // Energy transport
            BASIC_ENERGY_PIPE,
            HARDENED_ENERGY_PIPE,
            REINFORCED_ENERGY_PIPE,
            SIGNALUM_ENERGY_PIPE,
            RESONANT_ENERGY_PIPE,
            SUPERCONDUCTING_PIPE,
            // Empty higher tier energy pipes (do not conduct energy)
            EMPTY_REINFORCED_ENERGY_PIPE,
            EMPTY_SIGNALUM_ENERGY_PIPE,
            EMPTY_RESONANT_ENERGY_PIPE,
            EMPTY_SUPERCONDUCTING_PIPE,
    };

    public static void init() {
        for (var block : ALL_PIPES) {
            Registry.register(Registry.BLOCK, MtId.of(block.id), block);
        }
    }

}
