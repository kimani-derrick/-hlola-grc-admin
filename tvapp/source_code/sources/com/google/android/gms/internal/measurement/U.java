package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import l3.BinderC0971b;
import l3.InterfaceC0970a;
/* loaded from: classes.dex */
public abstract class U extends I implements V {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.measurement.F, com.google.android.gms.internal.measurement.V] */
    public static V asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof V) {
            return (V) queryLocalInterface;
        }
        return new F(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v37, types: [com.google.android.gms.internal.measurement.F] */
    @Override // com.google.android.gms.internal.measurement.I
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        boolean z7;
        boolean z8;
        W y3;
        boolean z9;
        boolean z10 = false;
        W w7 = null;
        W w8 = null;
        W w9 = null;
        W w10 = null;
        Z z11 = null;
        Z z12 = null;
        Z z13 = null;
        W w11 = null;
        W w12 = null;
        W w13 = null;
        W w14 = null;
        W w15 = null;
        W w16 = null;
        InterfaceC0395a0 interfaceC0395a0 = null;
        W w17 = null;
        W w18 = null;
        W w19 = null;
        W w20 = null;
        W w21 = null;
        switch (i7) {
            case 1:
                long readLong = parcel.readLong();
                H.d(parcel);
                initialize(BinderC0971b.z(parcel.readStrongBinder()), (C0405c0) H.a(parcel, C0405c0.CREATOR), readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) H.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                long readLong2 = parcel.readLong();
                H.d(parcel);
                logEvent(readString, readString2, bundle, z7, z8, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) H.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof W) {
                        y3 = (W) queryLocalInterface;
                    } else {
                        y3 = new Y(readStrongBinder);
                    }
                    w7 = y3;
                }
                long readLong3 = parcel.readLong();
                H.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, w7, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC0970a z14 = BinderC0971b.z(parcel.readStrongBinder());
                ClassLoader classLoader = H.f8350a;
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                long readLong4 = parcel.readLong();
                H.d(parcel);
                setUserProperty(readString5, readString6, z14, z9, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = H.f8350a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof W) {
                        w21 = (W) queryLocalInterface2;
                    } else {
                        w21 = new Y(readStrongBinder2);
                    }
                }
                H.d(parcel);
                getUserProperties(readString7, readString8, z10, w21);
                break;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof W) {
                        w20 = (W) queryLocalInterface3;
                    } else {
                        w20 = new Y(readStrongBinder3);
                    }
                }
                H.d(parcel);
                getMaxUserProperties(readString9, w20);
                break;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                H.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                H.d(parcel);
                setConditionalUserProperty((Bundle) H.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                H.d(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) H.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof W) {
                        w19 = (W) queryLocalInterface4;
                    } else {
                        w19 = new Y(readStrongBinder4);
                    }
                }
                H.d(parcel);
                getConditionalUserProperties(readString11, readString12, w19);
                break;
            case 11:
                ClassLoader classLoader3 = H.f8350a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                long readLong7 = parcel.readLong();
                H.d(parcel);
                setMeasurementEnabled(z10, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                H.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                H.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                H.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                InterfaceC0970a z15 = BinderC0971b.z(parcel.readStrongBinder());
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                long readLong11 = parcel.readLong();
                H.d(parcel);
                setCurrentScreen(z15, readString13, readString14, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof W) {
                        w18 = (W) queryLocalInterface5;
                    } else {
                        w18 = new Y(readStrongBinder5);
                    }
                }
                H.d(parcel);
                getCurrentScreenName(w18);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof W) {
                        w17 = (W) queryLocalInterface6;
                    } else {
                        w17 = new Y(readStrongBinder6);
                    }
                }
                H.d(parcel);
                getCurrentScreenClass(w17);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof InterfaceC0395a0) {
                        interfaceC0395a0 = (InterfaceC0395a0) queryLocalInterface7;
                    } else {
                        interfaceC0395a0 = new F(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                    }
                }
                H.d(parcel);
                setInstanceIdProvider(interfaceC0395a0);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof W) {
                        w16 = (W) queryLocalInterface8;
                    } else {
                        w16 = new Y(readStrongBinder8);
                    }
                }
                H.d(parcel);
                getCachedAppInstanceId(w16);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof W) {
                        w15 = (W) queryLocalInterface9;
                    } else {
                        w15 = new Y(readStrongBinder9);
                    }
                }
                H.d(parcel);
                getAppInstanceId(w15);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof W) {
                        w14 = (W) queryLocalInterface10;
                    } else {
                        w14 = new Y(readStrongBinder10);
                    }
                }
                H.d(parcel);
                getGmpAppId(w14);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof W) {
                        w13 = (W) queryLocalInterface11;
                    } else {
                        w13 = new Y(readStrongBinder11);
                    }
                }
                H.d(parcel);
                generateEventId(w13);
                break;
            case 23:
                String readString15 = parcel.readString();
                long readLong12 = parcel.readLong();
                H.d(parcel);
                beginAdUnitExposure(readString15, readLong12);
                break;
            case 24:
                String readString16 = parcel.readString();
                long readLong13 = parcel.readLong();
                H.d(parcel);
                endAdUnitExposure(readString16, readLong13);
                break;
            case 25:
                InterfaceC0970a z16 = BinderC0971b.z(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                H.d(parcel);
                onActivityStarted(z16, readLong14);
                break;
            case 26:
                InterfaceC0970a z17 = BinderC0971b.z(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                H.d(parcel);
                onActivityStopped(z17, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                H.d(parcel);
                onActivityCreated(BinderC0971b.z(parcel.readStrongBinder()), (Bundle) H.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                InterfaceC0970a z18 = BinderC0971b.z(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                H.d(parcel);
                onActivityDestroyed(z18, readLong17);
                break;
            case 29:
                InterfaceC0970a z19 = BinderC0971b.z(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                H.d(parcel);
                onActivityPaused(z19, readLong18);
                break;
            case 30:
                InterfaceC0970a z20 = BinderC0971b.z(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                H.d(parcel);
                onActivityResumed(z20, readLong19);
                break;
            case 31:
                InterfaceC0970a z21 = BinderC0971b.z(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof W) {
                        w12 = (W) queryLocalInterface12;
                    } else {
                        w12 = new Y(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                H.d(parcel);
                onActivitySaveInstanceState(z21, w12, readLong20);
                break;
            case 32:
                Bundle bundle3 = (Bundle) H.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof W) {
                        w11 = (W) queryLocalInterface13;
                    } else {
                        w11 = new Y(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                H.d(parcel);
                performAction(bundle3, w11, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString17 = parcel.readString();
                InterfaceC0970a z22 = BinderC0971b.z(parcel.readStrongBinder());
                InterfaceC0970a z23 = BinderC0971b.z(parcel.readStrongBinder());
                InterfaceC0970a z24 = BinderC0971b.z(parcel.readStrongBinder());
                H.d(parcel);
                logHealthData(readInt, readString17, z22, z23, z24);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof Z) {
                        z13 = (Z) queryLocalInterface14;
                    } else {
                        z13 = new C0400b0(readStrongBinder14);
                    }
                }
                H.d(parcel);
                setEventInterceptor(z13);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof Z) {
                        z12 = (Z) queryLocalInterface15;
                    } else {
                        z12 = new C0400b0(readStrongBinder15);
                    }
                }
                H.d(parcel);
                registerOnMeasurementEventListener(z12);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof Z) {
                        z11 = (Z) queryLocalInterface16;
                    } else {
                        z11 = new C0400b0(readStrongBinder16);
                    }
                }
                H.d(parcel);
                unregisterOnMeasurementEventListener(z11);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(H.f8350a);
                H.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof W) {
                        w10 = (W) queryLocalInterface17;
                    } else {
                        w10 = new Y(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                H.d(parcel);
                getTestFlag(w10, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = H.f8350a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                H.d(parcel);
                setDataCollectionEnabled(z10);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof W) {
                        w9 = (W) queryLocalInterface18;
                    } else {
                        w9 = new Y(readStrongBinder18);
                    }
                }
                H.d(parcel);
                isDataCollectionEnabled(w9);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                H.d(parcel);
                setDefaultEventParameters((Bundle) H.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                H.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                H.d(parcel);
                setConsent((Bundle) H.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                H.d(parcel);
                setConsentThirdParty((Bundle) H.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof W) {
                        w8 = (W) queryLocalInterface19;
                    } else {
                        w8 = new Y(readStrongBinder19);
                    }
                }
                H.d(parcel);
                getSessionId(w8);
                break;
            case 48:
                H.d(parcel);
                setSgtmDebugInfo((Intent) H.a(parcel, Intent.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
