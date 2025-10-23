package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5287a;

    public /* synthetic */ a(int i7) {
        this.f5287a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f5287a) {
            case 0:
                ?? obj = new Object();
                obj.f5264q = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: q  reason: collision with root package name */
                    public final MediaDescriptionCompat f5262q;

                    /* renamed from: r  reason: collision with root package name */
                    public final long f5263r;

                    {
                        this.f5262q = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f5263r = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb.append(this.f5262q);
                        sb.append(", Id=");
                        return AbstractC1111a.s(sb, this.f5263r, " }");
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i7) {
                        this.f5262q.writeToParcel(parcel2, i7);
                        parcel2.writeLong(this.f5263r);
                    }
                };
            case 2:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

                    /* renamed from: q  reason: collision with root package name */
                    public final Object f5265q;

                    /* renamed from: r  reason: collision with root package name */
                    public final Object f5266r;

                    {
                        this.f5266r = readParcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (obj2 instanceof MediaSessionCompat$Token) {
                            Object obj3 = this.f5266r;
                            Object obj4 = ((MediaSessionCompat$Token) obj2).f5266r;
                            if (obj3 == null) {
                                return obj4 == null;
                            } else if (obj4 == null) {
                                return false;
                            } else {
                                return obj3.equals(obj4);
                            }
                        }
                        return false;
                    }

                    public final int hashCode() {
                        Object obj2 = this.f5266r;
                        if (obj2 == null) {
                            return 0;
                        }
                        return obj2.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i7) {
                        parcel2.writeParcelable((Parcelable) this.f5266r, i7);
                    }
                };
            case 3:
                ?? obj2 = new Object();
                obj2.f5267q = parcel.readInt();
                obj2.f5269s = parcel.readInt();
                obj2.f5270t = parcel.readInt();
                obj2.f5271u = parcel.readInt();
                obj2.f5268r = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f5287a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i7];
            case 1:
                return new MediaSessionCompat$QueueItem[i7];
            case 2:
                return new MediaSessionCompat$Token[i7];
            case 3:
                return new ParcelableVolumeInfo[i7];
            default:
                return new PlaybackStateCompat[i7];
        }
    }
}
