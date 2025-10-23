package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class F implements IInterface {
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final IBinder f8264e;
    public final String f;

    public /* synthetic */ F(IBinder iBinder, String str, int i7) {
        this.d = i7;
        this.f8264e = iBinder;
        this.f = str;
    }

    public Parcel A() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f);
        return obtain;
    }

    public Parcel B(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f8264e.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void C(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8264e.transact(i7, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.d) {
            case 0:
                return this.f8264e;
            default:
                return this.f8264e;
        }
    }

    public Parcel y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f);
        return obtain;
    }

    public Parcel z(Parcel parcel, int i7) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f8264e.transact(i7, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e3) {
                obtain.recycle();
                throw e3;
            }
        } finally {
            parcel.recycle();
        }
    }
}
