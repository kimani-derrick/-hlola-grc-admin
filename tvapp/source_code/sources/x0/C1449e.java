package x0;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import r0.AbstractC1111a;
/* renamed from: x0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1449e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16149a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16150b;

    /* renamed from: c  reason: collision with root package name */
    public final L4.f f16151c;
    public final S0.l d;

    /* renamed from: e  reason: collision with root package name */
    public final List f16152e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f16153g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f16154h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16155i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f16156j;

    /* renamed from: k  reason: collision with root package name */
    public final Set f16157k;

    /* renamed from: l  reason: collision with root package name */
    public final List f16158l;

    /* renamed from: m  reason: collision with root package name */
    public final List f16159m;

    public C1449e(Context context, String str, L4.f fVar, S0.l lVar, ArrayList arrayList, int i7, Executor executor, Executor executor2, boolean z7, boolean z8, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        M5.g.f(context, "context");
        M5.g.f(lVar, "migrationContainer");
        AbstractC1111a.x("journalMode", i7);
        M5.g.f(arrayList2, "typeConverters");
        M5.g.f(arrayList3, "autoMigrationSpecs");
        this.f16149a = context;
        this.f16150b = str;
        this.f16151c = fVar;
        this.d = lVar;
        this.f16152e = arrayList;
        this.f = i7;
        this.f16153g = executor;
        this.f16154h = executor2;
        this.f16155i = z7;
        this.f16156j = z8;
        this.f16157k = linkedHashSet;
        this.f16158l = arrayList2;
        this.f16159m = arrayList3;
    }

    public final boolean a(int i7, int i8) {
        if ((i7 > i8 && this.f16156j) || !this.f16155i) {
            return false;
        }
        Set set = this.f16157k;
        if (set != null && set.contains(Integer.valueOf(i7))) {
            return false;
        }
        return true;
    }
}
