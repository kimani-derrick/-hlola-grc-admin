package com.google.firebase.concurrent;

import U4.n;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import e2.X;
import f2.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import n4.InterfaceC1036a;
import n4.InterfaceC1037b;
import n4.InterfaceC1038c;
import n4.InterfaceC1039d;
import o4.C1069a;
import o4.k;
import o4.o;
import p6.l;
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final k f9169a = new k(new n(3));

    /* renamed from: b  reason: collision with root package name */
    public static final k f9170b = new k(new n(4));

    /* renamed from: c  reason: collision with root package name */
    public static final k f9171c = new k(new n(5));
    public static final k d = new k(new n(6));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        o oVar = new o(InterfaceC1036a.class, ScheduledExecutorService.class);
        o[] oVarArr = {new o(InterfaceC1036a.class, ExecutorService.class), new o(InterfaceC1036a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oVar);
        for (o oVar2 : oVarArr) {
            l.h(oVar2, "Null interface");
        }
        Collections.addAll(hashSet, oVarArr);
        C1069a c1069a = new C1069a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new d(25), hashSet3);
        o oVar3 = new o(InterfaceC1037b.class, ScheduledExecutorService.class);
        o[] oVarArr2 = {new o(InterfaceC1037b.class, ExecutorService.class), new o(InterfaceC1037b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(oVar3);
        for (o oVar4 : oVarArr2) {
            l.h(oVar4, "Null interface");
        }
        Collections.addAll(hashSet4, oVarArr2);
        C1069a c1069a2 = new C1069a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new d(26), hashSet6);
        o oVar5 = new o(InterfaceC1038c.class, ScheduledExecutorService.class);
        o[] oVarArr3 = {new o(InterfaceC1038c.class, ExecutorService.class), new o(InterfaceC1038c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(oVar5);
        for (o oVar6 : oVarArr3) {
            l.h(oVar6, "Null interface");
        }
        Collections.addAll(hashSet7, oVarArr3);
        C1069a c1069a3 = new C1069a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new d(27), hashSet9);
        X b7 = C1069a.b(new o(InterfaceC1039d.class, Executor.class));
        b7.f = new d(28);
        return Arrays.asList(c1069a, c1069a2, c1069a3, b7.c());
    }
}
