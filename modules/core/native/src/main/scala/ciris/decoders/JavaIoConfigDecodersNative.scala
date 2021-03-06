package ciris.decoders

import java.io.File

import ciris.ConfigDecoder

trait JavaIoConfigDecoders {
  implicit val fileConfigDecoder: ConfigDecoder[String, File] =
    ConfigDecoder.catchNonFatal("File")(new File(_))
}
