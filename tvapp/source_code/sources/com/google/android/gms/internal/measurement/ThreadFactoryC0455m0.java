package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.google.android.gms.internal.measurement.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0455m0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public ThreadFactory f8612a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f8612a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
