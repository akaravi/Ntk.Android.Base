package ntk.base.api.file.viewModel;

import com.google.gson.annotations.SerializedName;

public class FileUploadModel {

    @SerializedName("ChunkNumber")
    public int ChunkNumber;
    @SerializedName("ChunkSize")
    public long ChunkSize ;
    @SerializedName("CurrentChunkSize")
    public long CurrentChunkSize;
    @SerializedName("TotalSize")
    public long TotalSize ;
    @SerializedName("Identifier")
    public String Identifier ;
    @SerializedName("FileName")
    public String FileName ;
    @SerializedName("RelativePath")
    public String RelativePath ;
    @SerializedName("TotalChunks")
    public int TotalChunks ;
}
