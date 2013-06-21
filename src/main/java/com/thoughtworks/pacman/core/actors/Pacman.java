package com.thoughtworks.pacman.core.actors;

import com.thoughtworks.pacman.core.Actor;
import com.thoughtworks.pacman.core.Direction;
import com.thoughtworks.pacman.core.SpacialCoordinate;
import com.thoughtworks.pacman.core.Tile;
import com.thoughtworks.pacman.core.maze.Maze;

public class Pacman extends Actor {
    private boolean dead = false;

    public Pacman(Maze maze) {
        super(maze, new SpacialCoordinate(14 * Tile.SIZE, 26 * Tile.SIZE + Tile.SIZE / 2), Direction.LEFT);
    }

    public void die() {
        this.dead = true;
    }

    public boolean isDead() {
        return dead;
    }
}
