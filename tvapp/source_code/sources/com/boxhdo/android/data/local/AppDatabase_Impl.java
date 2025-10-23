package com.boxhdo.android.data.local;

import C.d;
import C0.a;
import D0.i;
import M5.g;
import Z5.n;
import android.content.Context;
import b1.C0356c;
import b1.C0358e;
import b1.C0361h;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x0.C1449e;
import x0.C1455k;
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: m  reason: collision with root package name */
    public volatile C0361h f7294m;
    public volatile C0358e n;

    /* renamed from: o  reason: collision with root package name */
    public volatile C0356c f7295o;

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final C0356c c() {
        C0356c c0356c;
        if (this.f7295o != null) {
            return this.f7295o;
        }
        synchronized (this) {
            try {
                if (this.f7295o == null) {
                    this.f7295o = new C0356c(this);
                }
                c0356c = this.f7295o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0356c;
    }

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final C1455k d() {
        return new C1455k(this, new HashMap(0), new HashMap(0), "tbl_watch_list", "tbl_history", "tbl_continue_watch");
    }

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final a e(C1449e c1449e) {
        d dVar = new d(c1449e, new n(this));
        Context context = c1449e.f16149a;
        g.f(context, "context");
        c1449e.f16151c.getClass();
        return new i(context, c1449e.f16150b, dVar);
    }

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new m3.g[0]);
    }

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final Set h() {
        return new HashSet();
    }

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final Map i() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0361h.class, Collections.emptyList());
        hashMap.put(C0358e.class, Collections.emptyList());
        hashMap.put(C0356c.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final C0358e j() {
        C0358e c0358e;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new C0358e(this);
                }
                c0358e = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0358e;
    }

    @Override // com.boxhdo.android.data.local.AppDatabase
    public final C0361h o() {
        C0361h c0361h;
        if (this.f7294m != null) {
            return this.f7294m;
        }
        synchronized (this) {
            try {
                if (this.f7294m == null) {
                    this.f7294m = new C0361h(this);
                }
                c0361h = this.f7294m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0361h;
    }
}
