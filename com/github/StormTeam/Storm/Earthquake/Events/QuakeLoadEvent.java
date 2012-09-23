package com.github.StormTeam.Storm.Earthquake.Events;

import com.github.StormTeam.Storm.Tuple;
import com.github.StormTeam.Storm.Earthquake.Quake;

import org.bukkit.World;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * @author Giant
 */
public class QuakeLoadEvent extends Event implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled = false;
	
	private Quake q;
	private World w;
	private Tuple<Integer, Integer> e;
	private Tuple<Integer, Integer> p1;
	private Tuple<Integer, Integer> p2;
	
	public QuakeLoadEvent(Quake q) {
		this.q = q;
		this.w = q.getWorld();
		this.e = q.getEpicenter();
		this.p1 = q.getPointOne();
		this.p2 = q.getPointTwo();
	}
	
	public Quake getQuake() {
		return this.q;
	}
	
	public World getWorld() {
		return this.w;
	}
	
	public Tuple<Integer, Integer> getEpicenter() {
		return this.e;
	}
	
	public Tuple<Integer, Integer> getPointOne() {
		return this.p1;
	}
	
	public Tuple<Integer, Integer> getPointTwo() {
		return this.p2;
	}
	
	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}
	
	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
	
}
