package com.boxhdo.android.data.local;

import A5.t;
import A5.u;
import A5.v;
import C0.a;
import D0.c;
import M5.g;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import b1.C0356c;
import b1.C0358e;
import b1.C0361h;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x0.C1449e;
import x0.C1455k;
import x0.InterfaceC1450f;
import x0.q;
/* loaded from: classes.dex */
public abstract class AppDatabase {

    /* renamed from: a  reason: collision with root package name */
    public volatile c f7284a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f7285b;

    /* renamed from: c  reason: collision with root package name */
    public q f7286c;
    public a d;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public List f7288g;

    /* renamed from: k  reason: collision with root package name */
    public final Map f7292k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f7293l;

    /* renamed from: e  reason: collision with root package name */
    public final C1455k f7287e = d();

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f7289h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantReadWriteLock f7290i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    public final ThreadLocal f7291j = new ThreadLocal();

    public AppDatabase() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        g.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f7292k = synchronizedMap;
        this.f7293l = new LinkedHashMap();
    }

    public static Object n(Class cls, a aVar) {
        if (cls.isInstance(aVar)) {
            return aVar;
        }
        if (aVar instanceof InterfaceC1450f) {
            return n(cls, ((InterfaceC1450f) aVar).a());
        }
        return null;
    }

    public final void a() {
        boolean z7;
        if (this.f) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    public final void b() {
        if (!g().K().n() && this.f7291j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public abstract C0356c c();

    public abstract C1455k d();

    public abstract a e(C1449e c1449e);

    public List f(LinkedHashMap linkedHashMap) {
        g.f(linkedHashMap, "autoMigrationSpecs");
        return t.f135q;
    }

    public final a g() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        g.l("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return v.f137q;
    }

    public Map i() {
        return u.f136q;
    }

    public abstract C0358e j();

    public final void k() {
        g().K().h();
        if (!g().K().n()) {
            C1455k c1455k = this.f7287e;
            if (c1455k.f16166e.compareAndSet(false, true)) {
                Executor executor = c1455k.f16163a.f7285b;
                if (executor != null) {
                    executor.execute(c1455k.f16172l);
                } else {
                    g.l("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    public final boolean l() {
        c cVar = this.f7284a;
        if (cVar == null || !cVar.isOpen()) {
            return false;
        }
        return true;
    }

    public final Cursor m(C0.c cVar, CancellationSignal cancellationSignal) {
        g.f(cVar, "query");
        a();
        b();
        if (cancellationSignal != null) {
            return g().K().y(cVar, cancellationSignal);
        }
        return g().K().x(cVar);
    }

    public abstract C0361h o();
}
